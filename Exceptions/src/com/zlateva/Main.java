package com.zlateva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {
            return s.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();

        } catch (InputMismatchException e) {
            return 0;
        }
    }
}