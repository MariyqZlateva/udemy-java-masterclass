package com.zlateva;

import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {
        dayOfTheWeek(-1);
        dayOfTheWeek(1);
        dayOfTheWeek(2);
        dayOfTheWeek(3);
        dayOfTheWeek(4);
        dayOfTheWeek(5);
        dayOfTheWeek(6);
        dayOfTheWeek(7);
        dayOfTheWeek(11);
        System.out.println("-----------");
        dayOfTheWeekSecondSolution(-1);
        dayOfTheWeekSecondSolution(1);
        dayOfTheWeekSecondSolution(2);
        dayOfTheWeekSecondSolution(3);
        dayOfTheWeekSecondSolution(4);
        dayOfTheWeekSecondSolution(5);
        dayOfTheWeekSecondSolution(6);
        dayOfTheWeekSecondSolution(7);
        dayOfTheWeekSecondSolution(8);


    }

    public static void dayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }

    public static void dayOfTheWeekSecondSolution(int day) {
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if (day == 4) {
            System.out.println("Wednesday");
        } else if (day == 5) {
            System.out.println("Thursday");
        } else if (day == 6) {
            System.out.println("Friday");
        } else if (day == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
