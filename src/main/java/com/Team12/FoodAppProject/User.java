package com.Team12.FoodAppProject;

public abstract class User {

    protected String username, password;

    public boolean verifyLogin(String username, String password)
    {
        return username.compareTo(this.username) == 0 && password.compareTo(this.password) == 0;
    }
}
