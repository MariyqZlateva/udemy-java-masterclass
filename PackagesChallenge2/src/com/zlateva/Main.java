package com.zlateva;

import com.zlateva.calculate.Series;

public class Main {
    public static void main(String[] args) {
        System.out.println("10-th Fibonacci number = "+Series.fib(10));
        System.out.println("10! = "+Series.factorial(10));
        System.out.println(Series.sumOfNNumbers(10));
    }
}