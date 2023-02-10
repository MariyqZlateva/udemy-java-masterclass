package com.zlateva;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = initArr(10);
    //    System.out.println(array);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static int[] initArr(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        for (int last = arr.length - 1; last > 0; last--) {
            for (int current = 0; current < last; current++) {
                if (arr[current] < arr[current + 1]) {
                    int temp = arr[current + 1];
                    arr[current + 1] = arr[current];
                    arr[current] = temp;
                }
            }

        }
    }
}