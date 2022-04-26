package com.zlateva;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.zlateva.Util.validateName;
import static com.zlateva.Util.validateTransaction;

public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private List<Double> transactionsList;

    public Customer(String name, double initialTransaction) {
        validateName(name);
        validateTransaction(initialTransaction);
        this.name = name;
        this.transactionsList = new ArrayList<>(List.of(initialTransaction));
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactionsList() {
        return new ArrayList<>(transactionsList);
    }

    public void addTransaction(double newTransaction) {
        validateTransaction(newTransaction);
        transactionsList.add(newTransaction);
    }

    public double getBalance() {
        double balance = 0;
        for (Double aDouble : transactionsList) {
            balance += aDouble;
        }
        return balance;
    }


    @Override
    public String toString() {
        return "Customer " +
                "name='" + name;
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


    public static void main(String[] args) {

    }

}
