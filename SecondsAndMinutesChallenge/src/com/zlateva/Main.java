package com.zlateva;

public class Main {

    private static final int ZERO = 0;
    private static final String INVALID_VALUE = "Invalid value";
    private static final int SECONDS_IN_MINUTES = 60;

    public static void main(String[] args) {
        System.out.println(getDurationString(90, -42));
        System.out.println(getDurationString(1440, 40));
        System.out.println(getDurationString(60, 56));
        System.out.println(getDurationString(60, 60));
        System.out.println(getDurationString(3662));
        System.out.println(getDurationString(126));
        System.out.println(getDurationString(-113));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (!isPositive(minutes)) {
            return INVALID_VALUE;
        }
        if (!isSecondsValid(seconds)) {
            return INVALID_VALUE;
        }
        int hour = minutes / SECONDS_IN_MINUTES;
        int remainingMin = minutes % SECONDS_IN_MINUTES;
        return prefixZero(hour) + "h " + prefixZero(remainingMin) + "m " + prefixZero(seconds) + "s";
    }

    public static String getDurationString(int seconds) {
        if (!isPositive(seconds)) {
            return INVALID_VALUE;
        }
        int minutes = seconds / SECONDS_IN_MINUTES;
        int remainingSeconds = seconds % SECONDS_IN_MINUTES;
        return getDurationString(minutes, remainingSeconds);
    }


    //== private methods ==
    private static boolean isPositive(int value) {
        return value >= ZERO;
    }

    private static boolean isSecondsValid(int seconds) {
        return isPositive(seconds) && (seconds <= 59);
    }

    private static String prefixZero(int value) {
        return (value >= 0 && value <= 9) ? "0" + value : "" + value;
    }
}
