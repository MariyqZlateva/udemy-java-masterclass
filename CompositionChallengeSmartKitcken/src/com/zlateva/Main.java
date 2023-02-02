package com.zlateva;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.getCoffeeMaker().setHasWorkToDo(true);
//        kitchen.getRefrigerator().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getRefrigerator().orderFood();
//        kitchen.getCoffeeMaker().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();

    }
}
