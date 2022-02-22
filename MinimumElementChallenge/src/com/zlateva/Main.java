package com.zlateva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
// -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
// -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
// -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
// -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
// -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
// -Finally, print the minimum element in the array.
//        Tips:
//-Assume that the user will only enter numbers, never letters
//-For simplicity, create a Scanner as a static field to help with data input
//-Create a new console project with the name eMinElementChallengef

        //   System.out.println(Arrays.toString(readIntegers(6)));
        int[] array = initArray();
        fillArrayValues(array);
        printMinElementOfTheArray(array);
    }

        private static int[] initArray() {
        System.out.print("Enter the desired length of your integer array here = ");
        return new int[getInteger()];
    }

    private static void fillArrayValues(int[] array) {
        System.out.println("Enter values for each element in your integer array.");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element [" + (i + 1) + "] = ");
            array[i] = getInteger();
        }
    }

    private static int getInteger() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a integer number!");
                scanner.nextLine();
            }
        }
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private static void printMinElementOfTheArray(int[] array) {
        System.out.println("The minimum element of the array is " + findMin(array));
    }
}
