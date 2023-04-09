package com.zlateva;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Merry", "Sam", "John"};

        List<String> list = Arrays.asList(names);
        System.out.println("Print list names: ");
        list.forEach(System.out::println);

        list.replaceAll(String::toUpperCase);
        System.out.println("Print list names to upper case: ");
        list.forEach(System.out::println);

        list.replaceAll(s -> s += " " + getRandomChar('A', 'G') + ".");
        System.out.println("Random middle initial: ");
        list.forEach(System.out::println);

        list.replaceAll(s -> s+= " "+ getReversedName(s.split(" ")[0]));
        System.out.println("Names with reversed last names");
        list.forEach(System.out::println);
    }

    private static char getRandomChar(char startChar, char endChar) {
        return (char) randomInt((int) startChar, (int) endChar);
    }

    public static int randomInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    private static String getReversedName(String name) {
        return new StringBuilder(name).reverse().toString();
    }


}