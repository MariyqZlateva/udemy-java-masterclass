package com.zlateva;

public class Windows {
    private int windowSash;
    private double width;
    private double height;

    public Windows(int windowSash, double width, double height) {
        this.windowSash = windowSash;
        this.width = width;
        this.height = height;
    }

    public void openUp() {
        System.out.println("South wall window is open");
    }
}
