package com.zlateva;

public class Dimensions {
    private double width;
    private double height;

    public Dimensions(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double size() {
        return this.height * this.width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
