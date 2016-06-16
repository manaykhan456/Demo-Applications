package com.example.dell.model;

/**
 * Created by DELL on 6/15/2016.
 */
public class Movie extends CustomModel{

    private String
                    rating;

    // Getter
    public String getMovieName() { return getName(); }

    // Constructor
    public Movie(String name) { setName(name); }
}
