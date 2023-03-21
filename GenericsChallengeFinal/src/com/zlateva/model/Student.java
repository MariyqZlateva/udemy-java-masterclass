package com.zlateva.model;

import com.zlateva.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {
    private static int LAST_ID = 10_000;
    private String name;

    private String course;

    private int yearStarted;
    private int studentId;
    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = randomInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = randomInt(2018, 2023);
        studentId = LAST_ID++;
    }

    @Override
    public String toString() {
        return String.format("%d %-15s %-15s %d ",studentId, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public static int randomInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public static double randomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(studentId).compareTo(Integer.valueOf(o.studentId));
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }
}
