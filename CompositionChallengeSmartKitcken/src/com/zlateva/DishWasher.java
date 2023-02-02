package com.zlateva;

public class DishWasher {
    boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing dishes");
            hasWorkToDo = false;
        }
    }

    @Override
    public String toString() {
        return "DishWasher{" +
                "hasWorkToDo=" + hasWorkToDo +
                '}';
    }
}
