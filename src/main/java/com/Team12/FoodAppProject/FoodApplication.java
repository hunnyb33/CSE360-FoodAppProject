package com.Team12.FoodAppProject;

import javafx.application.Application;
import javafx.stage.Stage;

public class FoodApplication extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Management GUI");
        
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        Application.launch(args);
    }
}
