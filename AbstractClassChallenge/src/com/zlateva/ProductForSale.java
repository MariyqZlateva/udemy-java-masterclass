package com.zlateva;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(double quantity) {
        return quantity * price;
    }

    public void printItemizedLineItem(double quantity) {
        System.out.println(type + " quantity for " + getSalesPrice(quantity));
    }

    public abstract void showDetails();
}
