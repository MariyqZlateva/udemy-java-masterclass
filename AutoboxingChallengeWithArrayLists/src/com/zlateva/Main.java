package com.zlateva;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("DSK");

        bank.addNewCustomerWithInitialTransaction("Bob", 145.22);
        bank.addTransactionToAnExistingCustomer("Bob", 4455.4);
        bank.getCustomerList("Bob", true);

    }
}