package com.zlateva;

public class StringManipulationsMethods {

    //String manipulation methods -(comparison) indent, strip, stripLeading, stripTrailing, trim, toLowerCase, toUpperCase
    //(transform String) - concat, join, repeat, replace/replaceAll/replaceFirst, substring/subSequence

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startIndex);
        System.out.println("Birth year = " + birthDate.substring(startIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".length());
        System.out.println("-".repeat(20));

    }
}
