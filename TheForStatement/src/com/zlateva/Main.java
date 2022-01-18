package com.zlateva;

public class Main {

    public static void main(String[] args) {

        System.out.println("10 000 at 2% interest = " + calculateInterest(10000, 2.0));
        System.out.println("10 000 at 3% interest = " + calculateInterest(10000, 3.0));
        System.out.println("10 000 at 4% interest = " + calculateInterest(10000, 4.0));
        System.out.println("10 000 at 5% interest = " + calculateInterest(10000, 5.0));
        System.out.println("10 000 at 6% interest = " + calculateInterest(10000, 6.0));
        System.out.println("10 000 at 7% interest = " + calculateInterest(10000, 7.0));

        for (int j = 2; j < 9; j++) {
            System.out.println("10 000 at " + j + "% interest = " +
                    String.format("%.2f", calculateInterest(10000, j)));
        }
        System.out.println("---------------------------------");

        for (int j = 8; j >= 2; j--) {
            System.out.println("10 000 at " + j + "% interest = " +
                    String.format("%.2f", calculateInterest(10000, j)));
        }

        int counter = 0;
        for (int i = 3; i < 30; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.println("Number " + i + " is prime number");
                if (counter == 3) {
                    System.out.println("Found first 3 prime numbers");
                    break;
                }
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
