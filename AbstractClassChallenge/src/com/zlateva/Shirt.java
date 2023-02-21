package com.zlateva;

public class Shirt extends ProductForSale {


    public Shirt(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getType() + " " + getDescription() + " " + getPrice() + " $");
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getSalesPrice(double quantity) {
        return super.getSalesPrice(quantity);
    }

    @Override
    public void printItemizedLineItem(double quantity) {
        super.printItemizedLineItem(quantity);
    }
}
