package com.zlateva;

public class Main {

    public static void main(String[] args) {

        NorthWall northWall = new NorthWall(new Dimensions(4, 2.7),
                new Door(new Dimensions(1.5, 2), "white"));

        SouthWall southWall = new SouthWall(new Dimensions(4, 2.7),
                new Windows(3, 3.5, 2),
                new Blinds("Floral", 3.6, 2.1));

        EastWall eastWall = new EastWall(new Dimensions(5, 2.7));

        WestWall westWall = new WestWall(new Dimensions(5, 2.7));

        Floor floor = new Floor(new Dimensions(5, 4), "parquet",
                new Carpet(new Dimensions(1, 5), "wool"));

        Bed bed = new Bed(2.2, 1.8, "Vintage");

        Ceiling ceiling = new Ceiling(5, 4, new Chandelier("Vintage"));

        Bedroom bedroom = new Bedroom(northWall, southWall, westWall, eastWall, floor, ceiling, bed);

        bedroom.makeBedroom();
        bedroom.night();

    }
}
