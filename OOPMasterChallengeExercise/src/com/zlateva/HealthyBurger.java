package com.zlateva;

public class HealthyBurger extends BaseHamburger {

    private String healthyAddition1;
    private double healthyAddition1Price;
    private String healthyAddition2;
    private double healthyAddition2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown", meat, price);
    }
//
//    @Override
//    public double addAddition1(String addition1, double addition1Price) {
//        return super.addAddition1(addition1, addition1Price);
//    }
//
//    @Override
//    public double addAddition2(String addition2, double addition2Price) {
//        return super.addAddition2(addition2, addition2Price);
//    }


    @Override
    public double finalPrice() {
        return super.finalPrice() + healthyAddition1Price + healthyAddition2Price;
    }

    public double addHealthyAddition1(String healthyAddition1, double healthyAddition1Price) {
        this.healthyAddition1 = healthyAddition1;
        this.healthyAddition1Price = healthyAddition1Price;
        return healthyAddition1Price;
    }

    public double addHealthyAddition2(String healthyAddition2, double healthyAddition2Price) {
        this.healthyAddition2 = healthyAddition2;
        this.healthyAddition2Price = healthyAddition2Price;
        return healthyAddition2Price;
    }

    @Override
    public void itemize() {
        super.itemize();
        System.out.println("Added " + this.healthyAddition1 + " for an extra " + this.healthyAddition1Price +
                "\n" + "Added " + this.healthyAddition2 + " for an extra " + this.healthyAddition2);
    }
}
