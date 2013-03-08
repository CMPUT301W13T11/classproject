package ca.ualberta.cmput301w13t11.FoodBank.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;

import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 *  Helper class -- responsible for transforming HTTP response into Java Objects
 *  and vice-versa in service of the ServerClient.
 * @author Marko Tomislav Babic
 *
 */
public class ClientHelper {
	
	static private Gson gson = new Gson();
	
	/**
	 * Empty constructor.
	 */
	public ClientHelper()
	{
	}
	
	/**
	 * Converts the given recipe to a JSON object (this includes 
	 * re-encoding photos).
	 * @param recipe The recipe to be converted.
	 * @return A JSON version of the given recipe.
	 */
	public StringEntity toJSON(Recipe recipe)
	{
		StringEntity se = null;
		ServerRecipe sr = new ServerRecipe(recipe);
		
		try {
			se = new StringEntity(gson.toJson(sr));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return se;
		
	}
	
	public Recipe to(HttpResponse response) throws IOException
	{
		//TODO : conversion type wrong, needs to be a server response from which
		// serverrecipes can be extracted -- need to put more thought/research into this
		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
		String out, json = "";
		ServerRecipe sr;
		Recipe ret_value = new Recipe(new User("fake"), "");
		Type serverRecipeType = new TypeToken<ServerRecipe>(){}.getType();
		
		while ((out = br.readLine()) != null) {
			json += out;
		}
		
		sr = gson.fromJson(json, serverRecipeType);
		return ret_value;
	}

}
