package com.zlateva;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {

        String[] firstNames = {"Anna", "Bob", "Carole", "David", "Fried", "Garry"};

        Arrays.setAll(firstNames, i -> firstNames[i].toUpperCase());
        System.out.println("--> Transform to Uppercase");
        System.out.println(Arrays.toString(firstNames));
        System.out.println("++++++");

        List<String> backedByArray = Arrays.asList(firstNames);

        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
        System.out.println("--> Add random middle initial");
        System.out.println(Arrays.toString(firstNames));

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        System.out.println("--> Add reversed name as last name");
        Arrays.asList(firstNames).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(firstNames));

//        newList.removeIf(s-> s.substring(0, s.indexOf(" ")).equals
//                (s.substring(s.lastIndexOf(" ")+1)
//                ));
//        System.out.println("--> Remove names where first = last");

        newList.removeIf(s -> {
            String first = s.substring(0, s.indexOf(" "));
            String last = s.substring(s.lastIndexOf(" ") + 1);
            if (first.equals(last)){
                System.out.println("Removed = "+ first);
            }
            return first.equals(last);
        });

        System.out.println("--> Remove names where first = last");
        newList.forEach(s -> System.out.println(s));

    }

    private static char getRandomChar(char startChar, char endChar) {
        return (char) randomInt((int) startChar, (int) endChar);
    }

    private static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }

    public static int randomInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}