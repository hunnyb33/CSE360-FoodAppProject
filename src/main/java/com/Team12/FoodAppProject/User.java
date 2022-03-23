package com.Team12.FoodAppProject;

public abstract class User {

    private String username, password;

    public abstract boolean verifyLogin(String username, String password);
}
