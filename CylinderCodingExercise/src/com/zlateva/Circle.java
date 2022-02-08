package com.zlateva;

public class Circle {

//    1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
//    The class needs to have one constructor with parameter radius of type double, and it needs to initialize the fields.
//    In case the radius parameter is less than 0 it needs to set the radius field value to 0.
//    Write the following methods (instance methods):
//    * Method named getRadius without any parameters, it needs to return the value of radius field.
//    * Method named getArea without any parameters,
//    it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.
//    NOTE: All methods should be defined as public NOT public static.
//    NOTE: In total, you have to write 2 classes.
//    NOTE: Do not add a main method to the solution code.

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
