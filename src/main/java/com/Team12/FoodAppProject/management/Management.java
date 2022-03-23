package com.Team12.FoodAppProject.management;

import com.Team12.FoodAppProject.User;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.scene.image.Image;

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
			// Get directory of food items
			String userDirectory = System.getProperty("user.dir");
			String foodDirectory = userDirectory + "\\Food\\";
			Path path = Paths.get(foodDirectory);
			
			// Ensure that directory exists
			if(!Files.isDirectory(path)) Files.createDirectories(path);
			
			// Now create the new food item
			FileOutputStream fileOut = new FileOutputStream(foodDirectory + food.name + ".food");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(food);
			objectOut.close();
		}
		catch(Exception exception)
		{
			exception.printStackTrace(); // Is this even helpful for a GUI app?
		}
	}
	
	public void addFoodItem(String name, String priceStr, String timeToCookStr, String tagsStr, Image image, String description) throws Exception
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
