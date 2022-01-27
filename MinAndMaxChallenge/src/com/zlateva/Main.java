package com.zlateva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (number > maxValue) {
                    maxValue = number;
                }
                if (number < minValue) {
                    minValue = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min value is: " + minValue + ", and max value is: " + maxValue);
        scanner.close();
    }
}
