package com.zlateva;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static com.zlateva.Util.validateName;

public class Bank implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private List<Branch> branches;

    public Bank(String name) {
        this(name, new ArrayList<>());
    }

    public Bank(String name, List<Branch> branches) {
        validateName(name);
        this.name = name;
        this.branches = branches;
    }

    public void addBranch(Branch branch) {
        if (isBranchPresentInList(branch)) {
            System.out.println("Branch with " + branch.getBranchName() + " already exists!");
            return;
        }
        branches.add(branch);
    }

    public void addBranch(String branchName) {
        validateName(branchName);
        if (isBranchPresentInList(branchName)) {
            System.out.println("Branch with " + branchName + " already exists!");
            return;
        }
        Branch branch = new Branch(branchName);
        branches.add(branch);
    }

    public void addNewCustomerToBranch(String customerName, double initialTransaction, String branchName) {
        validateName(customerName);
        Branch branch = getBranchByName(branchName);
        if (branch == null) {
            System.out.println("Branch with name " + branchName + " doesnt exist.");
            return;
        }
        branch.addNewCustomerWithInitialTransaction(customerName, initialTransaction);
    }

    public void addNewTransactionForCustomerInBranch(String customerName, double transaction, String branchName) {
        validateName(customerName);
        Branch branch = getBranchByName(branchName);
        if (branch == null) {
            System.out.println("Branch with name " + branchName + " doesnt exist.");
            return;
        }
        branch.addCustomerNewTransaction(customerName, transaction);

    }

    public void getCustomerListForBranch(String branchName, boolean withTransactions) {
        validateName(branchName);
        Branch branch = getBranchByName(branchName);
        if (branch == null) {
            System.out.println("Branch with name " + branchName + " doesnt exist.");
            return;
        }
        // branch.getCustomersList().forEach(System.out::println);
        List<Customer> customersList = branch.getCustomersList();
        for (Customer customer : customersList) {
            System.out.println(customer);
            if (withTransactions) {
                List<Double> transactionsList = customer.getTransactionsList();
                for (Double transaction : transactionsList) {
                    System.out.println("\t" + transaction);
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Branch> getBranches() {
        return new ArrayList<>(branches);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Bank bank = (Bank) o;

        return name.equals(bank.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = (31 * result) + 17;
        return result;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }

    // == private methods ==
    private boolean isBranchPresentInList(String branchName) {
        for (Branch current : branches) {
            if (current.getBranchName().equals(branchName)) {
                return true;
            }
        }
        return false;
    }

    private boolean isBranchPresentInList(Branch branch) {
        return isBranchPresentInList(branch.getBranchName());
    }

    private Branch getBranchByName(String branchName) {
        for (Branch branch : branches) {
            if (branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

}
