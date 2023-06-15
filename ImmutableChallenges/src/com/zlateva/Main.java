package com.zlateva;

import com.bank.Bank;
import com.bank.BankAccount;
import com.bank.BankCustomer;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank(321456);
        bank.addCustomer("Joe", 500.00, 10000.00);

        BankCustomer joe = bank.getCustomer("000000010000000");
        System.out.println(joe);

        if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING,
                35)) {
            System.out.println(joe);
        }

        if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING,
                -535.00)) {
            System.out.println(joe);
        }

        BankAccount checking = joe.getAccount(BankAccount.AccountType.CHECKING);
        var transactions = checking.getTransactions();
        transactions.forEach((k, v) -> System.out.println(k + ": " + v));

        joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions().clear();
        System.out.println("_______________________________");
        joe.getAccount(BankAccount.AccountType.CHECKING).getTransactions().
                forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
