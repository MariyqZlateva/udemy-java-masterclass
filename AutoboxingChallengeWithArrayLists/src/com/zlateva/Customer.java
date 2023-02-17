package com.zlateva;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private ArrayList<Double> transactionList;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactionList = new ArrayList<>(List.of(initialTransaction));
    }


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return new ArrayList<>(transactionList);
    }

    public void addTransactions(double newTransaction) {
        transactionList.add(newTransaction);
    }

    public double getBalance() {
        double balance = 0;
        for (Double aDouble : transactionList) {
            balance += balance;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Customer name = " + name;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = (31 * result) + 17;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Customer contact = (Customer) o;
        return name.equals(contact.getName());
    }
}
