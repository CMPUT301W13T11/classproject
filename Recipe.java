package ca.ualberta.cmput313w13t11.FoodBank.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class which models a recipe. (TODO: better description)
 * @author 
 *
 */
public class Recipe {
	private User author;
	private String name;
	private String instructions;
	private ArrayList<Ingredient> ingredients;
	private String uri;
	
	
	
	/**
	 * Constructor.
	 * @param name The name of the recipe.
	 */
	public Recipe(User author, String name)
	{
		this.author = author;
		this.name = name;
		this.instructions = "";
		this.ingredients = new ArrayList<Ingredient>();
		/* TODO: find a good hashing function in order to assign to each recipe a unique URI
		* such that duplicates cannot be misinterpreted for one another on the server. */
		this.uri = "";
	}
	
	/**
	 * Constructor.
	 * @param name The name of the recipe.
	 * @param instructions
	 */
	public Recipe(User author, String name, String instructions)
	{
		this.author = author;
		this.name = name;
		this.instructions = instructions;
		this.ingredients = new ArrayList<Ingredient>();
		/* TODO: find a good hashing function in order to assign to each recipe a unique URI
		* such that duplicates cannot be misinterpreted for one another on the server. */
		this.uri = "";
		
	}
	
	/**
	 *  Constructor.
	 * @param name
	 * @param instructions
	 * @param ingredients
	 */
	public Recipe(User author, String name, String instructions, ArrayList<Ingredient> ingredients)
	{
		this.author = author;
		this.name = name;
		this.instructions = instructions;
		this.ingredients = ingredients;
		/* TODO: find a good hashing function in order to assign to each recipe a unique URI
		* such that duplicates cannot be misinterpreted for one another on the server. */
		this.uri = "";
	}
	
	//TODO add getters/setter
	
}
