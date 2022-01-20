package com.zlateva;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println(" While Count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("While true Count value is " + count);
            count++;
        }
        count = 1;
        do {
            System.out.println("Do while Count value is " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int sum = 0;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!(isEvenNumber(number))) {
                continue;
            }
            evenNumbersFound++;
            sum += number;
            System.out.println("Even number " + number);
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = "+ evenNumbersFound);
        System.out.println("Sum = " + sum);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
