package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteNumber = 10;
        short myShortNumber = 20;
        int myIntNumber = 50;
        long myLongSum = 50000L + (10L * (myByteNumber + myShortNumber + myIntNumber));
        System.out.println("My Long Sum is " + myLongSum);

        short shortTotal = (short) (1000 + 10 * (
                myByteNumber + myShortNumber + myIntNumber));

    }
}
