package com.zlateva;

public class Door {
    private Dimensions dimensions;
    private String colour;

    public Door(Dimensions dimensions, String colour) {
        this.dimensions = dimensions;
        this.colour = colour;
    }

    public void openTheDoor() {
        System.out.println("Opening the door...");
    }

    public String getColour() {
        return colour;
    }
}
