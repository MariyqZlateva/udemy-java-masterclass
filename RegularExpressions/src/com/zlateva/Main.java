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

    }
}