package com.Team12.FoodAppProject;

import com.Team12.FoodAppProject.management.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.stage.Stage;

public class FoodApplication extends Application
{
    Management management;
    
    @Override
    public void start(Stage primaryStage)
    {
        // Main label
        Label label = new Label("Welcome Management!\nHow would you like to adjust the menu?");
        
        // The three menu options
        Button addFoodButton = new Button("Add new food item");
        Button editFoodButton = new Button("Edit food item");
        Button removeFoodButton = new Button("Remove food item");
        
        // Set on actions
        addFoodButton.setOnAction(actionEvent -> AddFoodItemWindow());
        editFoodButton.setOnAction(actionEvent -> EditFoodItemWindow());
        
        // Add buttons and label to VBox
        VBox vBox = new VBox(label, addFoodButton, editFoodButton, removeFoodButton);
        
        // Create the management scene
        Scene scene = new Scene(vBox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Management GUI");
        primaryStage.show();
        
        // Create management object
        management = new Management();
    }
    
    private void AddFoodItemWindow()
    {
        AddFoodItemWindow(
                "Item Name",
                "Item Price",
                "Item Time to Cook",
                "Item Tags",
                "Item Description"
        );
    }
    
    private void AddFoodItemWindow(Food food)
    {
        // Get the easier fields
        String name = food.getName();
        String price = Double.toString(food.getPrice());
        String time = Integer.toString(food.getTimeToCook());
        String description = food.getDescription();
        
        // Handle tags
        String tags = "";
        for (String tag : food.getTags())
        {
            if(tags.compareTo("") != 0) tags += ", ";
            tags += tag;
        }
        
        // Now call the function
        AddFoodItemWindow(name, price, time, tags, description);
    }
    
    private void AddFoodItemWindow(String name, String price, String time, String tags, String description)
    {
        // Main label
        Label addFoodLabel = new Label("Add Food Item");
        
        // Text Fields
        TextField nameTextField = new TextField(name);
        TextField priceTextField = new TextField(price);
        TextField timeTextField = new TextField(time);
        TextField tagTextField = new TextField(tags);
        
        // Add Button for adding Images
        Button imageButton = new Button("Add Item Image");
        
        // Text Area for description
        TextArea descriptionTextArea = new TextArea(description);
        
        // Add Confirm Button
        Button confirmButton = new Button("Confirm New Item");
        confirmButton.setOnAction(actionEvent ->
        {
            try
            {
                management.addFoodItem(
                        nameTextField.getText(),
                        priceTextField.getText(),
                        timeTextField.getText(),
                        tagTextField.getText(),
                        null,
                        descriptionTextArea.getText());
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        });
        
        // Add to VBox
        VBox vBox = new VBox
        (
            addFoodLabel,
            nameTextField,
            priceTextField,
            timeTextField,
            tagTextField,
            imageButton,
            descriptionTextArea,
            confirmButton
        );
        
        // Create Add Food Item Window
        Stage stage = new Stage();
        Scene scene = new Scene(vBox, 300, 300);
        stage.setScene(scene);
        stage.setTitle("Add Food Item");
        stage.show();
    }
    
    private void EditFoodItemWindow()
    {
        // Main label
        Label addFoodLabel = new Label("Edit Food Item");
        
        // Text Field
        TextField nameTextField = new TextField("Item Name");
        
        // Add Search Button
        Button confirmButton = new Button("Edit Item");
        confirmButton.setOnAction(actionEvent ->
        {
            Food food = management.findFoodItem(nameTextField.getText());
            AddFoodItemWindow(food);
        });
        
        // Add to VBox
        VBox vBox = new VBox
                (
                        addFoodLabel,
                        nameTextField,
                        confirmButton
                );
        
        // Create Add Food Item Window
        Stage stage = new Stage();
        Scene scene = new Scene(vBox, 300, 150);
        stage.setScene(scene);
        stage.setTitle("Edit Food Item");
        stage.show();
    }
    
    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
