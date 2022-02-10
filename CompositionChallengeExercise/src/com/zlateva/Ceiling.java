package com.zlateva;

public class Ceiling {
    private double length;
    private double weight;
    private  Chandelier chandelier;

    public Ceiling(double length, double weight, Chandelier chandelier) {
        this.length = length;
        this.weight = weight;
        this.chandelier = chandelier;
    }
    public void turnLightOn(){
        chandelier.lightOn();
        System.out.println( "Now is light");
    }
    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }
}
