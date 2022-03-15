package management;

import java.awt.*;
import java.util.ArrayList;

/*
 * NOTE: This class is temporary as I need to wait for the proper one to be made by Kyle.
 * */

public class Food
{
	String name;
	double price;
	int timeToCook;
	ArrayList<String> tags;
	Image image;
	String description;
	
	public Food(String name, double price, int timeToCook, ArrayList<String> tags, Image image, String description)
	{
		this.name = name;
		this.price = price;
		this.timeToCook = timeToCook;
		this.tags = tags;
		this.image = image;
		this.description = description;
	}
}
