package com.zlateva;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //   printMenu();
        boolean flag = true;

        ArrayList<String> groceries = new ArrayList<>();
        int choice = 0;
        while (flag) {
            printMenu();
            choice = getInt();
            switch (choice) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) > 0) {
                groceries.remove(trimmed);
            }else {
                System.out.println("This product "+ trimmed +" isn't in list");
            }

        }
    }

    private static void printMenu() {

        String textBlock = """
                 Available actions:
                 0 - to shutdown 
                 1 - to add item(s) to list (comma delimited list)
                 2 - to remove any items
                Enter a number for which action you want to do: """;
        System.out.println(textBlock + " ");
    }

    private static int getInt() {
        while (true) {
            try {
                int number = scanner.nextInt();
                scanner.nextLine();
                return number;
            } catch (InputMismatchException e) {
                System.out.print("Please enter a number!");
                scanner.nextLine();
            }
        }
    }

}