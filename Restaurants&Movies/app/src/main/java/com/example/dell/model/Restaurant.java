package com.example.dell.model;

/**
 * Created by DELL on 6/15/2016.
 */
public class Restaurant extends CustomModel{

    private String
                address;

    // Getters
    public String getRestaurantName() { return getName(); }

    // Constructor
    public Restaurant(String name) { setName(name); }
}
