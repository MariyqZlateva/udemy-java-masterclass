package com.zlateva;

import java.util.ArrayList;

public class Customer {
    //        3. Customer
//
// - It has two fields, A String called name and an ArrayList that holds objects of type Double called transactions.
// - A constructor that takes a String (name of customer) and a double (initial transaction). It initialises name and instantiates transactions.
// - And three methods, they are (their functions are in their names):
// - getName(), getter for name.
// - getTransactions(), getter for transactions.
// - addTransaction(), has one parameter of type double (transaction) and doesn't return anything.
//        TIP: In Bank, use the findBranch() method in each of the other four methods to validate a branch. Do the same thing in Branch with findCustomer() - except for the two getters.
//        TIP: In Customer, think about what else you need to do in the constructor when you instantiate a Customer object.
//        TIP: Think about what methods you need to call from another class when implementing a method.
//        TIP: Be extremely careful with the spelling of the names of the fields, constructors and methods.
//        TIP: Be extremely careful about spaces and spelling in the printed output.
//        NOTE: All transactions are deposits (no withdraws/balances).
//        NOTE: All fields are private.
//        NOTE: All constructors are public.
//        NOTE: All methods are public (except for findBranch() and findCustomer() which are private).
//        NOTE: There are no static members.
//        NOTE: Do not add a main method to the solution code.
//        NOTE: If you get an error from the Evaluate class,it 's most likely the constructor. Check if you' ve added
//        a constructor or if the constructor has the right arguments.


    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}
