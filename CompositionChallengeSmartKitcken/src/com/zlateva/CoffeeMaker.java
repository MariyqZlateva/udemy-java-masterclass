package com.zlateva;

public class CoffeeMaker {
    boolean hasWorkToDo;

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "hasWorkToDo=" + hasWorkToDo +
                '}';
    }
}
