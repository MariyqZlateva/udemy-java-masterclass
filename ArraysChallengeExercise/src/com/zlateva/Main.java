package com.zlateva;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();// for the generic method only...

        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is the highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] myArray = initArray();
        fillArrayValues(myArray);

        int[] myCopiedArray = copyArray(myArray);

        selectionSort(myCopiedArray);

        System.out.println("Unsorted = " + Arrays.toString(myArray));
        System.out.println("Sorted = " + Arrays.toString(myCopiedArray));
    }

    private static int[] initArray() {
        System.out.print("Enter the desired length of your integer array here = ");
        return new int[getInteger()];
    }

    private static int[] copyArray(int[] array) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
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


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    //todo complete this method
    private static void printArrayOnSingleLine(int[] array) {
        //Print this -> Array = [value, value, value,...]
    }

    private static void bubbleSort(int[] array) {
        for (int right = array.length - 1; right > 0; right--) {
            System.out.println(Arrays.toString(array));
            for (int left = 0; left < right; left++) {
                if (array[left] > array[left + 1]) {
                    swap(array, left, (left + 1));
                }
            }
        }
    }

    private static void selectionSort(int[] array) {
        for (int last = array.length - 1; last > 0; last--) {
            int max = last;
            for (int i = 0; i < last; i++) {
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            swap(array, max, last);
        }
    }

    private static void swap(int[] array, int left, int right) {
        if (!isSwapInputDataValid(array, left, right)) {
            return;// throw some Exception / Custom exception in real world application
        }
        if (isArrayOfOneElement(array)) {
            return;
        }
        if (left == right) {
            return;
        }
        if (array[left] == array[right]) {
            return;
        }
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private static boolean isArrayNull(int[] array) {
        return array == null;
    }

    private static boolean isArrayOfOneElement(int[] array) {
        return array.length == 1;
    }

    private static boolean isIndexInArrayBounds(int[] array, int index) {
        return index >= 0 && index <= array.length - 1;
    }

    private static boolean isSwapInputDataValid(int[] array, int leftIndex, int rightIndex) {
        if (isArrayNull(array)) {
            return false;
        }
        if (!isIndexInArrayBounds(array, leftIndex)) {
            return false;
        }
        return isIndexInArrayBounds(array, rightIndex);
    }

    //generic method to perform null check on all types(T) of arrays
    //use trough class instance(object)
    //e.g main.isArrayNull(type(T)[] array);
    private <T> boolean isArrayNull(T[] array) {
        return array == null;
    }

}

