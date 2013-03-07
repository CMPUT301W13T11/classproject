package ca.ualberta.cmput301w13t11.FoodBank.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class which models a recipe. (TODO: better description)
 * @author 
 *
 */
public class Recipe {
	private User author;
	private String title;
	private String instructions;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<Photo> photos;
	private String uri;
	
	
	
	/**
	 * Constructor.
	 * @param title The title of the recipe.
	 */
	public Recipe(User author, String title)
	{
		this.author = author;
		this.title = title;
		this.instructions = "";
		this.ingredients = new ArrayList<Ingredient>();
		this.photos = new ArrayList<Photo>();
		/* TODO: find a good hashing function in order to assign to each recipe a unique URI
		* such that duplicates cannot be misinterpreted for one another on the server. */
		this.uri = "";
	}
	
	/**
	 * Constructor.
	 * @param title The title of the recipe.
	 * @param instructions The set of instructions for executing the recipe.
	 */
	public Recipe(User author, String title, String instructions)
	{
		this.author = author;
		this.title = title;
		this.instructions = instructions;
		this.ingredients = new ArrayList<Ingredient>();
		this.photos = new ArrayList<Photo>();

		/* TODO: find a good hashing function in order to assign to each recipe a unique URI
		* such that duplicates cannot be misinterpreted for one another on the server. */
		this.uri = "";
		
	}
	
	/**
	 *  Constructor.
	 * @param title The title of the recipe.
	 * @param instructions The set of instructions used to execute the recipe.
	 * @param ingredients The list of ingredients associated with this recipe.
	 */
	public Recipe(User author, String title, String instructions, ArrayList<Ingredient> ingredients)
	{
		this.author = author;
		this.title = title;
		this.instructions = instructions;
		this.ingredients = ingredients;
		this.photos = new ArrayList<Photo>();

		/* TODO: find a good hashing function in order to assign to each recipe a unique URI
		* such that duplicates cannot be misinterpreted for one another on the server. */
		this.uri = "";
	}
	
	public Recipe(User author, String title, String instructions, ArrayList<Ingredient> ingredients,
				ArrayList<Photo> photos)
	{
		this.author = author;
		this.title = title;
		this.instructions = instructions;
		this.ingredients = ingredients;
		this.photos = photos;

		/* TODO: find a good hashing function in order to assign to each recipe a unique URI
		* such that duplicates cannot be misinterpreted for one another on the server. */
		this.uri = "";
	}
	//TODO add getters/setter
	
}
