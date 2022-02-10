package com.zlateva;

public class NorthWall {
    private Dimensions dimensions;
    private Door door;

    public NorthWall(Dimensions dimensions, Door door) {
        this.dimensions = dimensions;
        this.door = door;
    }

    public void getInToRoom(){
        door.openTheDoor();
        System.out.println("You can see the window");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
