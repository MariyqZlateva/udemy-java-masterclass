package com.zlateva;

public class SouthWall {
    private Dimensions dimensions;
    private Windows windows;
    private Blinds blinds;

    public SouthWall(Dimensions dimensions, Windows windows, Blinds blinds) {
        this.dimensions = dimensions;
        this.windows = windows;
        this.blinds = blinds;
    }
    public void ventilate(){
        blinds.pickUp();
        windows.openUp();
        System.out.println("Starting ventilate the room");
    }


}
