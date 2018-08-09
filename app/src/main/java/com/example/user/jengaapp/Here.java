package com.example.user.jengaapp;

public class Here {
    //    refer to image based on id
    int image;
    String name,description;
    public Here(int image,String name, String description){
        this.image = image;
        this.name = name;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
