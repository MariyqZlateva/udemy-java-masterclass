package com.zlateva;

import java.util.Arrays;

public class TrainingClass {

    public static void main(String[] args) {
        //three ways you can initialize array in Java
        //check in google about this
        int[] array1 = new int[5];
        int[] array2 = new int[]{};
        int[] array3 = new int[]{7, 28, -6, 12, 4, 17};

        //your training part starts here
        //Methods
        // == firstly all kids of validations you can think of ==
        //1. Copy the array
        //2. Print the array on a single line
        //3. Swap method
        //4. Bubble sort
        //5. Selection sort
        // for all the above refer to Main.java
        //write all that delete the functions and write them again

        //***********************************************************
        //array which has to be copied
        int[] arrayToBeCopied = new int[]{7, 28, -6, 12, 4, 17};
        // perform copy of the array
        int[] arrayToBeSorted = copyIntegerArray(arrayToBeCopied);
        //call sorting methods
        bubbleSort(arrayToBeSorted); // it should be the copy NOT the original
        //print original array
        System.out.print("Unsorted original array >>> ");
        printArrayOnSingleLine(arrayToBeCopied);
        //print sorted copy of the array
        System.out.print("Sorted copied array     >>> ");
        printArrayOnSingleLineTernaryOperator(arrayToBeSorted);
    }


    private static int[] copyIntegerArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    private static void printArrayOnSingleLine(int[] array) {
        System.out.print("Element =[");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] + "]");
            }
        }
    }

    private static void printArrayOnSingleLineTernaryOperator(int[] array) {
        System.out.print("Element = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i < array.length - 1) ? (array[i] + ",") : (array[i] + "]\n"));
        }
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private static void bubbleSort(int[] array) {
        for (int right = array.length - 1; right > 0; right--) {
            for (int left = 0; left < right; left++) {
                if (array[left] > array[left + 1]) {
                    swap(array, left, left + 1);
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
}