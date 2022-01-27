package com.zlateva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 5) {
                    break;
                }
            } else {
                System.out.println("Invalid number:");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of your numbers is: " + sum);
        scanner.close();
    }

}

