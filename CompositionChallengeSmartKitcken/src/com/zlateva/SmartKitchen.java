package com.zlateva;

public class SmartKitchen {
    private DishWasher dishWasher;
    private Refrigerator refrigerator;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen() {
        this.dishWasher = new DishWasher(false);
        this.refrigerator = new Refrigerator(false);
        this.coffeeMaker = new CoffeeMaker(false);
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag) {
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }


    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();
    }
}
