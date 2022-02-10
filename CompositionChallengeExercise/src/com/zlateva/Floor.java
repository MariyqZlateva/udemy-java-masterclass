package com.zlateva;

public class Floor {
    private Dimensions dimensions;
    private String kindOfFloor;
    private Carpet carpet;

    public Floor(Dimensions dimensions, String kindOfFloor, Carpet carpet) {
        this.dimensions = dimensions;
        this.kindOfFloor = kindOfFloor;
        this.carpet = carpet;
    }

    public void cleanFloor() {
        carpet.foldTheCarpet();
        System.out.println("Cleaning the floor...");
    }
}
