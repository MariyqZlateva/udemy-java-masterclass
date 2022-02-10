package com.zlateva;

public class Bed {
    private double length;
    private double width;
    private String bedStyle;

    public Bed(double length, double width, String bedStyle) {
        this.length = length;
        this.width = width;
        this.bedStyle = bedStyle;
    }

    public void makeBed(){
        changeSheets();
        System.out.println("Fixed the bed");
    }

    public void changeSheets(){
        System.out.println("Sheets are changed");
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getBedStyle() {
        return bedStyle;
    }
}
