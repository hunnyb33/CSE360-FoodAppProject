package com.Team12.FoodAppProject.Ordering;

import javafx.scene.image.Image;

import java.util.ArrayList;

/*
 * NOTE: This class is temporary as I need to wait for the proper one to be made by Kyle.
 * */

public class Food {

	private String name;
	private double price;
	private final int timeToCook;
	private ArrayList<String> tags;
	private Image image;
	private String description;

	// cannot have a default food item
	private Food() {}

	// custom constructor for Food()
	public Food(String name, double price, int timeToCook, ArrayList<String> tags, Image image, String description) {

		this.name = name;
		this.price = price;
		this.timeToCook = timeToCook;
		this.tags = tags;
		this.image = image;
		this.description = description;

	} // end of custom constrcutor for Food() item

}
