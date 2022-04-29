package com.zlateva;

import java.util.ArrayList;

public class Bank {
    //        Your job is to create a simple banking application.
//        Implement the following classes:
//        1.Bank
//         -It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
//        - A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
//        - And five methods, they are (their functions are in their names):
// -addBranch(), has one parameter of type String (name of the branch) and returns a boolean.
// It returns true if the branch was added successfully or false otherwise.
// -addCustomer(), has three parameters of type String (name of the branch), String (name of the customer),
// double (initial transaction) and returns a boolean. It returns true if the customer was added successfully or false otherwise.
// -addCustomerTransaction(), has three parameters of type String (name of the branch),
// String (name of the customer), double (transaction) and returns a boolean. It returns true if the customers transaction
// was added successfully or false otherwise.
// -findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
// Return the Branch if it exists or null otherwise.
//- listCustomers(), has two parameters of type String (name of the Branch),
// boolean (print transactions) and returns a boolean. Return true if the branch exists or false otherwise.
// This method prints out a list of customers.
//→ TEST CODE
//
//        Bank bank = new Bank("National Australia Bank");
//
//        bank.addBranch("Adelaide");
//
//        bank.addCustomer("Adelaide", "Tim", 50.05);
//        bank.addCustomer("Adelaide", "Mike", 175.34);
//        bank.addCustomer("Adelaide", "Percy", 220.12);
//
//        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
//        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
//        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
//
//        bank.listCustomers("Adelaide", true);
//→ OUTPUT
//
//        The list of customers should be printed out in the following format if boolean parameter is true:
//
//        Customer details for branch Adelaide
//        Customer: Tim[1]
//        Transactions
//                [1]  Amount 50.05
//                [2]  Amount 44.22
//                [3]  Amount 12.44
//        Customer: Mike[2]
//        Transactions
//                [1]  Amount 175.34
//                [2]  Amount 1.65
//        Customer: Percy[3]
//        Transactions
//                [1]  Amount 220.12
//
//        and if false, only the customers - no transactions:
//
//        bank.listCustomers("Adelaide", false);
//
//        Customer details for branch Adelaide
//        Customer: Tim[1]
//        Customer: Mike[2]
//        Customer: Percy[3]

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null && branch.newCustomer(customerName, initialTransaction)) {
            branch.newCustomer(customerName, initialTransaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null && !branch.newCustomer(customerName,transaction)) {
            branch.addCustomerTransaction(customerName, transaction);
            return true;
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customers = branch.getCustomers();
            for (int i = 0; i < branch.getCustomers().size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String branchName) {
        for (Branch checkedBranch : branches) {
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }
}
