package com.zlateva;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance;
    private ArrayList<Integer> transactions;

    public Account(String account) {
        this.accountName = account;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums.");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + "withdrawn. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums.");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for (int amount : transactions) {
            this.balance += amount;
        }
        System.out.println("Calculated balance is " + this.balance);
    }


}
