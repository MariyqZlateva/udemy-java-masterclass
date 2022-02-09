package com.zlateva;

public class Main {

    public static void main(String[] args) {

//   The Swimming Company has asked you to write an application that calculates
//   the volume of cuboid shaped pools.
//  NOTE: All methods should be defined as public NOT public static.
//  NOTE: In total, you have to write 2 classes.
//  NOTE: Do not add a main method to the solution code.

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

    }
}
