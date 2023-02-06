package com.zlateva;

public class Main {
    public static void main(String[] args) {
//     Item cocke = new Item("drink", "cocke", 1.5);
//     cocke.printItem();
//     cocke.setSize("LARGE");
//     cocke.printItem();
//
//     Item avocado = new Item("Topping", "avocado", 1.5);
//     avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("Bacon", "cheese", "mayo");
//        regularMeal.setDrinkSize("large");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "7-up",
//                "chilli");
//        secondMeal.addBurgerToppings("lettuce", "cheese", "mayo");
//        secondMeal.setDrinkSize("small");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up",
                "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("small");
        deluxeMeal.printItemizedList();
    }
}