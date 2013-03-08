package ca.ualberta.cmput301w13t11.FoodBank.model;

import java.util.ArrayList;

/**
 * Object we can populate with photos from the Db when retrieving an entry.
 * @author Marko
 *
 */
public class PhotoGallery {

	private ArrayList<Photo> photos;
	
	public PhotoGallery()
	{
		photos = new ArrayList<Photo>();
	}
	
	public PhotoGallery(ArrayList<Photo> photos)
	{
		this.photos = photos;
	}
	
	public void addPhoto(Photo photo)
	{
		photos.add(photo);
	}
	
	public ArrayList<Photo> getPhotos()
	{
		return this.photos;
	}
}
