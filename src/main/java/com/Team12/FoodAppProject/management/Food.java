package com.Team12.FoodAppProject.management;

import java.io.Serializable;
import java.util.ArrayList;
import javafx.scene.image.Image;

/*
 * NOTE: This class is temporary as I need to wait for the proper one to be made by Kyle.
 * */

public class Food implements Serializable
{
	// Ensures that food class remains the same
	private static final long serialVersionUID = 3924929988541074404L;
	
	private String name;
	private double price;
	private int timeToCook;
	private ArrayList<String> tags;
	private Image image;
	private String description;
	
	public Food(String name, double price, int timeToCook, ArrayList<String> tags, Image image, String description)
	{
		this.name = name;
		this.price = price;
		this.timeToCook = timeToCook;
		this.tags = tags;
		this.image = image;
		this.description = description;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getTimeToCook()
	{
		return timeToCook;
	}
	
	public ArrayList<String> getTags()
	{
		return tags;
	}
	
	public Image getImage()
	{
		return image;
	}
	
	public String getDescription()
	{
		return description;
	}
}
