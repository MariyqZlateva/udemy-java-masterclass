package com.zlateva;

public class StringInspectionMethods {
    public static void main(String[] args) {

        String bulletIt = "Print a Bullet List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a Bullet List:
                        \u2022 First Point
                            \u2022 Sub Point
                """;

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d\n", age);

        int yearOfBirth = 2023 - age;

        System.out.printf("Age is = %d, Birth year = %d%n ", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age); // 2 is precision of decimal points

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i); // 6 is number of spaces before printing numbers
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        System.out.println("++++++++++++++++++++++++++++++++");
        printInformation("Hello World");
        printInformation("");
        printInformation("\t  \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));


    }

    //Strings Inspection Methods - length, charAt, indexOf/lastIndexOf, isEmpty, isBlank
    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is Blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0)); // %c print a single character

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }

}