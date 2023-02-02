package com.zlateva;

public class Refrigerator {
    boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering food");
        }
    }
    @Override
    public String toString() {
        return "Refrigerator{" +
                "hasWorkToDo=" + hasWorkToDo +
                '}';
    }
}
