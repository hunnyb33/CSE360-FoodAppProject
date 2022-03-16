package com.Team12.FoodAppProject.management;

import java.io.*;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class Management extends User
{
	public Management()
	{
		username = "Admin";
		password = "TotallySecurePassword";
	}
	
	// Helper method to write an object to a file
	private void writeFood(Food food)
	{
		try
		{
			// TODO: Figure out where to actually store the food files
			FileOutputStream fileOut = new FileOutputStream(".\\Food\\food_" + food.name);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(food);
			objectOut.close();
		}
		catch(Exception exception)
		{
			exception.printStackTrace(); // Is this even helpful for a GUI app?
		}
	}
	
	private void addFoodItem(String name, double price, int timeToCook, ArrayList<String> tags, Image image, String description)
	{
		Food food = new Food(name, price, timeToCook, tags, image, description);
		writeFood(food);
	}
}
