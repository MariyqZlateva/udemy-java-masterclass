package com.zlateva;

public class Main {

    private static final double ZERO = 0d;
    private static final double NEGATIVE_ONE = -1d;
    private static final double INCHES_IN_FEET = 12d;

    public static void main(String[] args) {
        double calculation = calcFeetAndInchesToCentimeters(5d, 7d);
        System.out.println(calculation);
        System.out.println("Inches  = " + calcFeetAndInchesToCentimeters(67d) + " sm");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!isNotNegative(feet)) {
            return NEGATIVE_ONE;
        }
        if (!isInchesValid(inches)) {
            return NEGATIVE_ONE;
        }
        double feetToInch = feet * INCHES_IN_FEET;
        double sum = inches + feetToInch;
        return sum * 2.54d;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (!isNotNegative(inches)) {
            return NEGATIVE_ONE;
        }

        double remainingInches = inches % INCHES_IN_FEET;
        System.out.println(remainingInches + " remaining inches");

        double remainingFeet = (inches - remainingInches) / INCHES_IN_FEET;
        System.out.println(remainingFeet + " remain feet");

        return calcFeetAndInchesToCentimeters(remainingFeet, remainingInches);
    }


    //== private methods ==
    private static boolean isNotNegative(double feet) {
        return feet >= ZERO;
    }

    private static boolean isInchesValid(double inches) {
        return isNotNegative(inches) && (inches <= INCHES_IN_FEET);
    }

}
