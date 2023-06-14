package com.zlateva;

public class Student {

    private final String name;
    private final StringBuilder studentsNotes;

    public Student(String name, StringBuilder studentsNotes) {
        this.name = name;
        this.studentsNotes = studentsNotes; //new StringBuilder(studentsNotes);
    }

    public String getName() {
        return name;
    }

    public StringBuilder getStudentsNotes() {
        return studentsNotes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentsNotes=" + studentsNotes +
                '}';
    }
}
