package ca.ualberta.cmput301w13t11.FoodBank.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Communicates with the server to perform searches, upload recipes and upload photos to recipes.
 * TODO: write tests for these methods
 * @author Marko Tomislav Babic
 *
 */
public class ServerClient {

	static private final Logger logger = Logger.getLogger(ServerClient.class.getName());
	static private String test_server_string = "http://cmput301.softwareprocess.es:8080/testing/cmput301w13t11/";
	private HttpClient httpclient = new DefaultHttpClient();
	private ClientHelper helper = new ClientHelper();
	
	/**
	 * Empty constructor.
	 */
	public ServerClient()
	{
		
	}
	
	/**
	 * Uploads the given recipe to the server.
	 * TODO: should return error codes????
	 * @param recipe The recipe to be uploaded.
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public void uploadRecipe(Recipe recipe) throws IllegalStateException, IOException
	{
		HttpEntity entity;
		HttpResponse response = null;
		HttpPost httpPost = new HttpPost(test_server_string+recipe.getTitle());
		StringEntity se = null;
		String status;
		
		se = helper.toJSON(recipe);
		
		httpPost.setHeader("Accept","application/json");
		httpPost.setEntity(se);
		
		try {
			response = httpclient.execute(httpPost);
		} catch (ClientProtocolException cpe) {
			logger.log(Level.SEVERE, cpe.getMessage());
			cpe.printStackTrace();
		} catch (IOException ioe) {
			logger.log(Level.SEVERE, ioe.getMessage());
			ioe.printStackTrace();
		}
		
		status = response.getEntity().toString();
		logger.log(Level.INFO, "upload request server response: " + response);
	}
	
	/**
	 * Performs a search of online recipes by keywords
	 * @param str The string of keywords we wish to search by.
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public void searchByKeywords(String str) throws ClientProtocolException, IOException
	{
		ArrayList<Recipe> search_results;
		HttpResponse response;
		String statusString;
		HttpGet search_request = new HttpGet(test_server_string+"_search&q=" + 
												java.net.URLEncoder.encode(str, "UTF-8"));
		search_request.setHeader("Accept", "application/json");

		response = httpclient.execute(search_request);
		String status = response.getStatusLine().toString();
		logger.log(Level.INFO, "search response: " + status);
		
		search_results = helper.toRecipeList(response);
		
		//TODO: stores these results in the "SearchResults" db and notify that db's views		
		
	}
	
	
	public void attachPhotoToRecipe(Photo photo, Recipe recipe)
	{
		//TODO: implement
	}
}
