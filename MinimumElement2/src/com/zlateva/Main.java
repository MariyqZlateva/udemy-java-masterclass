package com.zlateva;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findInt(returnedArray);
        System.out.println("min =" + returnedMin);

        System.out.println(); reverseArray(returnedArray);
        System.out.println(Arrays.toString(returnedArray) );

    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findInt(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    private static void reverseArray(int[] array) {
        int last = array.length - 1;
        for (int i = 0; i < array.length / 2; i++, last--) {
            int temp = array[i];
            array[i] = array[last];
            array[last] = temp;
        }
    }
}