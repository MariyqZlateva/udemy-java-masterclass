package com.zlateva;

public class Bedroom {
    private NorthWall northWall;
    private SouthWall southWall;
    private WestWall westWall;
    private EastWall eastWall;
    private Floor floor;
    private Ceiling ceiling;
    private Bed bed;

    public Bedroom(NorthWall northWall, SouthWall southWall, WestWall westWall,
                   EastWall eastWall, Floor floor, Ceiling ceiling, Bed bed) {
        this.northWall = northWall;
        this.southWall = southWall;
        this.westWall = westWall;
        this.eastWall = eastWall;
        this.floor = floor;
        this.ceiling = ceiling;
        this.bed = bed;
    }

    public void night(){
        ceiling.turnLightOn();
    }

    public void makeBedroom(){
        northWall.getInToRoom();
        southWall.ventilate();
        floor.cleanFloor();
        bed.makeBed();
    }
}
