package com.zlateva;

public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of digits in number 123 is " + sumDigits(123));
        System.out.println("The sum of digits in number -123 is " + sumDigits(-123));
        System.out.println("The sum of digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of digits in number 32 123 is " + sumDigits(32123));
        System.out.println("The sum of digits in number 0 123 is " + sumDigits(0));

    }

    private static int sumDigits(int number) {
        if (number >= 10) {
            int sum = 0;
            while (number >= 1) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }

}
