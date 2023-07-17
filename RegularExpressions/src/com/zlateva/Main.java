package com.zlateva;

public class Main {
    public static void main(String[] args) {

        String string = "I am a string. Yes I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiikl99z";

        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiikl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println("Is hello matches = " + alphanumeric.matches("^hello"));
        System.out.println("Is abcDeee matches = " + alphanumeric.matches("^abcDeee"));
        // when use .matches "^", the entire string has matched
        System.out.println("Is abcDeeeF12Ghhiiiikl99z matches = " + alphanumeric.matches("abcDeeeF12Ghhiiiikl99z"));

        System.out.println(alphanumeric.replaceAll("ikl99z$", "THE END"));

        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", " I replaced a letter here "));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));


        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";

        // replace all, without "^ej"
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[absdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        // (?i) makes the regex case-insensitive
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhitespace = "I have blanks and \ta tab, and also a newLine\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));
        System.out.println(hasWhitespace.replaceAll("\\S", ""));
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\W", "X"));
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));


    }
}