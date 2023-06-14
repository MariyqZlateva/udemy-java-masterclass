package com.zlateva;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuilder bobNotes = new StringBuilder();
        StringBuilder billsNotes = new StringBuilder("Bill struggles with generics.");

        Student bob = new Student("Bob", bobNotes);
        Student bill = new Student("Bill", billsNotes);

        List<Student> students = new ArrayList<>(List.of(bob, bill));
        List<Student> studentsFirstCopy = new ArrayList<>(students);
        List<Student> studentsSecondCopy = List.copyOf(students);
        List<Student> studentsThirdCopy = Collections.unmodifiableList(students);
        studentsFirstCopy.add(new Student("Bonnie", new StringBuilder()));

        //studentsSecondCopy.add(new Student("Bonnie", new StringBuilder()));
        //18 row throws UnsupportedOperationException(studentsSecondCopy is unmodifiableCollection)
        //studentsSecondCopy.set(0,new Student("Bonnie", new StringBuilder()));
        //20 row throws UnsupportedOperationException(studentsSecondCopy is unmodifiableCollection)
        //studentsSecondCopy.sort(Comparator.comparing(Student::getName));
        //23 row throws UnsupportedOperationException(studentsSecondCopy is unmodifiableCollection)

        //studentsThirdCopy.set(0,new Student("Bonnie", new StringBuilder()));
        //29 row throws UnsupportedOperationException(studentsSecondCopy is unmodifiableCollection)

        studentsFirstCopy.sort(Comparator.comparing(Student::getName));
        students.add(new Student("Bonnie", new StringBuilder()));
        bobNotes.append("Bob was one of my first students.");
        StringBuilder bonniesNotes = studentsFirstCopy.get(2).getStudentsNotes();
        bonniesNotes.append("Bonnie is taking 3 of my courses");

        System.out.println("----------students-------------");
        students.forEach(System.out::println);

        System.out.println("----------students first copy (shallow copy)-----------------");
        studentsFirstCopy.forEach(System.out::println);

        System.out.println("----------students second copy (shallow copy)-----------------");
        studentsSecondCopy.forEach(System.out::println);

        System.out.println("----------students third copy (return a unmodifiable vew)-----------------");
        studentsThirdCopy.forEach(System.out::println);
    }
}