package com.zlateva;

import com.bank.BankAccount;
import com.bank.BankCustomer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //    In this challenge, you should create a BankAccount class.
        //    This should have a type, indicating the type of account, like Checking or Savings or some other type.
        //    It should have a balance, the initial dollar amount in the account.
        //    You should also create a BankCustomer that has a customer name, a customer id, and a List of accounts.
        //    You should use the techniques I discussed in the last videos, to design these classes.
        //    Create a couple of instances of bank customers, confirming that you can't change a Customer's data at all,
        //    after it's initialized.
        //    Create a subclass of the bank customer, and confirm that the subclass can't tamper with the customer's
        //    data as well

        
        BankCustomer joe = new BankCustomer("Joe", 500.00, 100000.00);
        System.out.println(joe);

        List<BankAccount> accounts = joe.getAccounts();
        accounts.clear();
        System.out.println(joe);

    }
}
