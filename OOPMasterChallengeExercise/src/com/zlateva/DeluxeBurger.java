package com.zlateva;

public class DeluxeBurger extends BaseHamburger {
    private String chips = "Chips";
    private double chipsPrice = 5.0;
    private String drink = "Drink";
    private double drinkPrice = 3.3;


    public DeluxeBurger() {
        super("Deluxe", "White", "Bacon", 55);
    }

    @Override
    public double finalPrice() {
        return (super.getBasePrice() + this.drinkPrice + this.chipsPrice);
    }

    @Override
    public void addAddition1(String addition1, double addition1Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addAddition2(String addition2, double addition2Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addAddition3(String addition3, double addition3Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addAddition4(String addition4, double addition4Price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void itemize() {
        System.out.println("Added " + this.chips + " for un extra " + this.chipsPrice +
                "\n" + "Added " + this.drink + " for un extra " + this.drinkPrice +
                "\n" + "Total Deluxe burger price is " + finalPrice());
    }
}
