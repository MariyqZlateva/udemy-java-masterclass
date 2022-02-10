package com.zlateva;

public class Blinds {

    private String model;
    private double with;
    private double height;

    public Blinds(String model, double with, double height) {
        this.model = model;
        if(with<0){
            this.with=0;
        }else {
            this.with = with;
        }
        if(height<0){
            this.height =0;
        }else {
            this.height = height;
        }
    }
    public void pullDown(){
        System.out.println("Blinds pulled down");
    }

    public void pickUp(){
        System.out.println("Blinds picked up");
    }
}
