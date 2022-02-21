package com.zlateva;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myValue = 10;
        int anotherIntValue = myValue;

        System.out.println("My int value = " + myValue);
        System.out.println("Another int value = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("My int value = " + myValue);
        System.out.println("Another int value = " + anotherIntValue);

        // reference has an address not an object
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("My int array = "+ Arrays.toString(myIntArray));
        System.out.println("Another array = "+ Arrays.toString(anotherArray));

        anotherArray[0]=4;
        System.out.println("After modify my int array = "+ Arrays.toString(myIntArray));
        System.out.println("After modify another array = "+ Arrays.toString(anotherArray));

        anotherArray = new int[]{5,6,7,8,9};
        modifyArray(myIntArray);
        System.out.println("After change my int array = "+ Arrays.toString(myIntArray));
        System.out.println("After change another array = "+ Arrays.toString(anotherArray));
    }
    private static void modifyArray(int[]array){
        array[0]=2;
        array = new int[] {1,2,3,4,5};
    }
}
