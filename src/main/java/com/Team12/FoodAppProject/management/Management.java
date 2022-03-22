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
	
	private void addFoodItem(String name, String priceStr, String timeToCookStr, String tagsStr, Image image, String description) throws Exception
	{
		// Cast price and timeToCook to double and int
		double price = Double.parseDouble(priceStr);
		int timeToCook = Integer.parseInt(timeToCookStr);
		
		// Parse through the tags
		ArrayList<String> tags = new ArrayList<>();
		int prevEnd = 0;
		
		for(int i = 0; i < tagsStr.length(); i++)
		{
			if(tagsStr.charAt(i) == ',')
			{
				tags.add(tagsStr.substring(prevEnd, i));
				prevEnd = i + 1;
			}
		}
		
		tags.add(tagsStr.substring(prevEnd));
		
		Food food = new Food(name, price, timeToCook, tags, image, description);
		writeFood(food);
	}
	
	private Food findFoodItem(String name)
	{
		try
		{
			FileInputStream fileIn = new FileInputStream(".\\Food\\food_" + name);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			return (Food)objectIn.readObject();
		}
		catch(Exception exception)
		{
			return null;
		}
	}
	
	private void deleteFoodItem(String name)
	{
		try
		{
			File fileToDelete = new File(".\\Food\\food_" + name); // Needs testing
			fileToDelete.delete();
		}
		catch(Exception exception)
		{
			exception.printStackTrace(); // Is this even helpful for a GUI app?
		}
	}
}
