package com.zlateva;

public class Carpet {
    private Dimensions carpetDimension;
    private String material;

    public Carpet(Dimensions carpetDimension, String material) {
        this.carpetDimension = carpetDimension;
        this.material = material;
    }

    public void foldTheCarpet() {
        System.out.println("The carpet is folded");
    }
}
