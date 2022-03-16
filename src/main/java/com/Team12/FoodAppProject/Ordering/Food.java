package com.Team12.FoodAppProject.Ordering;

import javafx.scene.image.Image;
import java.io.Serializable;
import java.util.ArrayList;

public class Food implements Seriablizable {

	private String name;
	private double price;
	private final int timeToCook;
	private ArrayList<String> tags;
	private Image image;
	private String description;

	// cannot have a default food item
	private Food() {}

	/** Constructor for a Food object
	* @param name name of this new food item as a string
	* @param price price of this food as a double
	* @param timeToCook time it takes for this food item to be made once it starts
	* @param tags tags for this food item as stored in an array list, java.util.ArrayList
	* @param image image for this item, Image as defined in javafx.scene.image.Image
	* @param description description for this food item as a string
	*/
	public Food(String name, double price, int timeToCook, ArrayList<String> tags, Image image, String description) {

		this.name = name;
		this.price = price;
		this.timeToCook = timeToCook;
		this.tags = tags;
		this.image = image;
		this.description = description;

	} // end of custom constrcutor for Food() item

	/** Accessor for name of this item
	*/
	public String getName() {

		return this.name;

	} // end of getName() method defintion

	/** Accessor for price of this item
	*/
	public double getPrice() {

		return this.price;

	} // end of getPrice() method defintion

	/** Accessor for time to cook of this item
	*/
	public int getTimeToCook() {

		return this.timeToCook();

	} // end of getTimeToCook() method defintion

	/** for the tags of this item
	* @return java.util.ArrayList
	*/
	public List<String> getTags() {

		return this.tags;

	} // end of getTags() method defintion

	/** Accessor for the image of this item
	* @return javafx.scene.image.Image
	*/
	public Image getImage() {

		return this.image;

	} // end of getImage() function defintion

	/** Accessor for the desription of this item
	*/
	public String getDescription() {

		return this.description;

	} // end of getDestription() function defintion

	/** Sets the name of this food item
	* <p> All mutators in this class should only be accessed by the Management class
	*/
	public void setName(String name) {

		this.name = name;

	} // end of setName() function  defintion

	/** Set the price for this food item
	* <p> All mutators in this class should only be accessed by the Management class
	*/
	public void setPrice(double price) {

		this.price = price;

	} // end of setPrice() method defintion

	/** Sets the time to cook for this food item
	* <p> All mutators in this class should only be accessed by the Management class
	*/
	public void setTimeToCook(int timeToCook) {

		this.timeToCook = timeToCook;

	} // end of setTimeToCook() method defintion

	/** Do we want this function or replace with just addTag() and removeTag() functions?
	*/
	public void setTags(List<String> tags) {

		// work in progress

	} // end of setTags() function

	/** Sests the image for this food item
	* <p> All mutators on this class should only be accessed by the Management class
	* @param image is from javafx.scene.image.Image
	*/
	public void setImage(Image image) {

		this.image = image;

	} // end of setImage() function

	/** Sets the description for this food item
	* <p> All mutators in this class should only be accessed by the Management class
	*/
	public void setDescription(String description) {

		this.description = description;

	} // end of setDescription() function

	/** Checks if 2 foods are the same only by comaring the name variable
	* <p> For most applications outside of management this is acceptable
	* @param item1 first item as a Food object
	* @param item2 second item, Food object
	* @return true if the names match, false if otherwise
	*/
	public boolean compare(Food item1, Food item2) {

		// checking for string equality
		if (stringComapre(item1.getName(), item2.getName()) == 0) {

			return true;

		} // end of if they are the same block

		// else return false
		else {

			return false;

		} // end of else return false

	} // end of compare() method defintion

	/** Checks if 2 food items are the same by compare all variables in a Food object
	* <p> This is for adding food items to the menu by management
	* <p> Work in progress, will alway return true for now
	* @param item1 first item as a food object
	* @param item2 first item as a food object
	* @return true if all the variables mathc, false if otherwise
	*/
	public boolean strictCompare(Food item1, Food item2) {

		// work in progress
		return true;

	} // end of strictCompare() method defintion

} // end of Food class defintion
