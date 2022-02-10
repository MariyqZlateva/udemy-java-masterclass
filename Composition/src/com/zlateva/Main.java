package com.zlateva;

public class Main {

    public static void main(String[] args) {
        Case theCase = new Case("220B", "Dell", "240", new Dimensions(20, 20, 5));

        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", " Asus", 5, 4, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUp();

    }
}
