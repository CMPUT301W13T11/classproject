package ca.ualberta.cmput301w13t11.FoodBank.model;

import java.util.ArrayList;

/**
 * A recipe class that can be written directly to the server -- ie. rather
 * than storing images as a Bitmap it encodes them as a string using Base64
 * encoding.  Also provides functionality for converting a ServerRecipe
 * to a regular recipe which can be utilized by the rest of the program.
 * @author Marko
 *
 */
public class ServerRecipe{
	
	private User author;
	private String title;
	private String instructions;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<ServerPhoto> photos;
	private String uri;
	
	public ServerRecipe(Recipe recipe)
	{
		this.author = recipe.getAuthor();
		this.title = recipe.getTitle();
		this.instructions = recipe.getInstructions();
		this.ingredients = recipe.getIngredients();
		this.uri = recipe.getUri();
		
		ArrayList<Photo> photos = recipe.getPhotos();
		this.photos = new ArrayList<ServerPhoto>();
		ServerPhoto temp;
		for (Photo p : photos) {
			temp = new ServerPhoto(p);
			this.photos.add(temp);
		}
	}
	
	//TODO: convert server recipe to regular recipe method (easy)

}
