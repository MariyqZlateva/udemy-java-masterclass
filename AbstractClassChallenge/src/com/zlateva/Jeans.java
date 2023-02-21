package com.zlateva;

public class Jeans extends ProductForSale {


    public Jeans(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type);
        System.out.printf("The price is $6.2f %n", price);
        System.out.println(description);
    }

}
