package com.zlateva;

public record Person(String name, String dob) {
//    public Person(String name, String dob) {
//        this.name = name;
//        this.dob = dob.replace('-','/');
//    }

    public Person {
        if (dob == null) throw new IllegalArgumentException("BAd data");
        dob = dob.replace('-', '/');
    }

    public Person(Person p) {
        this(p.name, p.dob);
    }

}
