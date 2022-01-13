package com.zlateva;

public class Main {

    public static void main(String[] args) {
        double myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double myValuesTotal = 100 * (myFirstValue + mySecondValue);
        System.out.println("mySum = "+ myValuesTotal);
        double theRemainder = myValuesTotal % 40.00;
        System.out.println("theRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = "+ isNoRemainder);
        if (isNoRemainder == false) {
            System.out.println("Got some remainder");
        }
        System.out.println("wasRemainder = " + isNoRemainder);
    }
}
