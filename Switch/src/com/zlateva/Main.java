package com.zlateva;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int mySwitch = 3;
        switch (mySwitch) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3, or a 4, or a 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
        }

        char myTestChar = 'e';
        switch (myTestChar) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(myTestChar + " was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }
        String month = "JANUARY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Found January");
                break;
            case "june":
                System.out.println("Found June");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
