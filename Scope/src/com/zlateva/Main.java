package com.zlateva;

public class Main {
    public static void main(String[] args) {

        String varFour = "This is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        System.out.println(" private varThree is not visible here");
//        System.out.println("scopeInstance varOne is "+ scopeCheck.getPrivateVar());
//        System.out.println(varFour);
//
//        scopeCheck.timesTwo();
//        System.out.println("*************************************");
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
    }
}