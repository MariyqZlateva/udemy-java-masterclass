package com.zlateva;

public class Main {
    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
//
//        int passWord = 674312;
//        Password password = new ExtendedPassword(passWord);
//        password.storePassword();
//
//        password.letMeIn(5232266);
//        password.letMeIn(97745);
//        password.letMeIn(548888);
//        password.letMeIn(0);
//        password.letMeIn(-674312);
//        password.letMeIn(674312);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is "+ SIBTest.owner);

    }
}