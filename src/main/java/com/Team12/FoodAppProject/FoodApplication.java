package com.Team12.FoodAppProject;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.stage.Stage;

public class FoodApplication extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        // Main label
        Label label = new Label("Welcome Management!\nHow would you like to adjust the menu?");
        
        // The three menu options
        Button addFoodButton = new Button("Add new food item");
        Button editFoodButton = new Button("Edit food item");
        Button removeFoodButton = new Button("Remove food item");
        
        // Set on actions
        addFoodButton.setOnAction(actionEvent -> AddFoodItemWindow());
        
        // Add buttons and label to VBox
        VBox vBox = new VBox(label, addFoodButton, editFoodButton, removeFoodButton);
        
        // Create the management scene
        Scene scene = new Scene(vBox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Management GUI");
        primaryStage.show();
    }
    
    private void AddFoodItemWindow()
    {
        // Main label
        Label addFoodLabel = new Label("Add Food Item");
        
        // Text Fields
        TextField nameTextField = new TextField("Item Name");
        TextField priceTextField = new TextField("Item Price");
        TextField timeTextField = new TextField("Item Time to Cook");
        TextField tagTextField = new TextField("Item Tags");
        
        // Add Button for adding Images
        Button imageButton = new Button("Add Item Image");
        
        // Add Confirm Button
        Button confirmButton = new Button("Confirm New Item");
        
        // Add to VBox
        VBox vBox = new VBox
        (
            addFoodLabel,
            nameTextField,
            priceTextField,
            timeTextField,
            tagTextField,
            imageButton,
            confirmButton
        );
        
        // Create Add Food Item Window
        Stage stage = new Stage();
        Scene scene = new Scene(vBox, 300, 300);
        stage.setScene(scene);
        stage.setTitle("Add Food Item");
        stage.show();
    }
    
    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
