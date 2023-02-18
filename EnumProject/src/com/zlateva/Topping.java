package com.zlateva;

public enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice(){
        return switch (this){
            case BACON -> 1.6;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }
}
