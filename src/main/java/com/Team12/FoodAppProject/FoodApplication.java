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
        primaryStage.setTitle("Management GUI");
        
        // Main label
        Label label = new Label("Welcome Management!\nHow would you like to adjust the menu?");
        
        // The three menu options
        Button addFoodButton = new Button("Add new food item");
        Button editFoodButton = new Button("Edit food item");
        Button removeFoodButton = new Button("Remove food item");
        
        // Add buttons and label to VBox
        VBox vBox = new VBox(label, addFoodButton, editFoodButton, removeFoodButton);
        
        // Create the management scene
        Scene scene = new Scene(vBox, 800, 400);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
