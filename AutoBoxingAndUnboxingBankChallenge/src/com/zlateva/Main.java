package com.zlateva;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Customer> karlovoCustomers = new ArrayList<>();
        karlovoCustomers.add(new Customer("Pencho", 145.55d));
        karlovoCustomers.add(new Customer("Ivan", 100.55d));
        karlovoCustomers.add(new Customer("Stanislav", 14.55d));
        karlovoCustomers.add(new Customer("Nikolaj", 120.55d));
        List<Customer> sopotCustomers = new ArrayList<>();
        sopotCustomers.add(new Customer("Petko", 200d));
        sopotCustomers.add(new Customer("Nikola", 200d));
        sopotCustomers.add(new Customer("Petar", 200d));
        List<Customer> plovdivCustomers = new ArrayList<>();
        plovdivCustomers.add(new Customer("Lili", 400d));
        plovdivCustomers.add(new Customer("Vili", 500d));
        plovdivCustomers.add(new Customer("Vanili", 400d));
        plovdivCustomers.add(new Customer("Mili", 600d));

        List<Branch> branches = new ArrayList<>();
        branches.add(new Branch("Karlovo", karlovoCustomers));
        branches.add(new Branch("Sopot", sopotCustomers));
        branches.add(new Branch("Plovdiv", plovdivCustomers));

        Bank bank = new Bank("DSK", branches);

        System.out.println();
        bank.addBranch("Krasnodar");

        bank.addNewCustomerToBranch("Jji", 55.0d, "Krasnodar");
        bank.addNewCustomerToBranch("Jji", 55.0d, "Krasnodar");
        bank.addNewTransactionForCustomerInBranch("Jji", 95.0d, "Krasnodar");
        bank.addNewTransactionForCustomerInBranch("Jji", 65.0d, "Krasnodar");
        bank.addNewTransactionForCustomerInBranch("Jji", 35.0d, "Krasnodar");

        bank.getCustomerListForBranch("Krasnodar", true);

    }
}
