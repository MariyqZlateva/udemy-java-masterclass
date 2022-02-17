package com.zlateva;

public class BaseHamburger {
    private String name;
    private String rollType;
    private String meat;
    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;
    private double price;

    public BaseHamburger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void addAddition1(String addition1, double addition1Price) {
        this.addition1 = addition1;
        this.addition1Price = addition1Price;

    }

    public void addAddition2(String addition2, double addition2Price) {
        this.addition2 = addition2;
        this.addition2Price = addition2Price;

    }

    public void addAddition3(String addition3, double addition3Price) {
        this.addition3 = addition3;
        this.addition3Price = addition3Price;
    }

    public void addAddition4(String addition4, double addition4Price) {
        this.addition4 = addition4;
        this.addition4Price = addition4Price;
    }

    public double finalPrice() {
        return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
    }

    public double getBasePrice() {
        return price;
    }

    public void itemize() {
        System.out.println(
                "\n" + "Added " + this.addition1 + " for an extra " + addition1Price +
                        "\n" + "Added " + this.addition2 + " for an extra " + addition2Price +
                        "\n" + "Added " + this.addition3 + " for an extra " + addition3Price +
                        "\n" + "Added " + this.addition4 + " for an extra " + addition4Price +
                        "\n" + "Total price for " + this.name+ " = " + finalPrice());
    }
}
