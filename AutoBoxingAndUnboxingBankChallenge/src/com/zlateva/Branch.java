package com.zlateva;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static com.zlateva.Util.validateName;
import static com.zlateva.Util.validateTransaction;

public class Branch implements Serializable {

    private static final long serialVersionUID = 1L;

    private String branchName;
    private List<Customer> customersList;

    public Branch(String branchName) {
        this(branchName, new ArrayList<>());
    }

    public Branch(String branchName, List<Customer> customers) {
        validateName(branchName);
        this.branchName = branchName;
        this.customersList = customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public List<Customer> getCustomersList() {
        return new ArrayList<>(customersList);
    }

    public void addCustomer(Customer customer) {
        if (isCustomerPresentInList(customer)) {
            System.out.println("Customer with that name " + customer.getName() + " is present in list.");
            return;
        }
        customersList.add(customer);

        System.out.println("Added " + customer);
    }

    public void addNewCustomerWithInitialTransaction(String customerName, double initialTransaction) {
        validateName(customerName);
        validateTransaction(initialTransaction);
        if (getCustomerByName(customerName) != null) {
            System.out.println("Customer with that name " + customerName + " is present in list.");
            return;
        }
        Customer customer = new Customer(customerName, initialTransaction);
        customersList.add(customer);
    }

    public void addCustomerNewTransaction(Customer customer, double transaction) {
        validateTransaction(transaction);
        if (!isCustomerPresentInList(customer)) {
            System.out.println("Customer with that name " + customer.getName() + " is not present in list.");
            return;
        }
        customer.addTransaction(transaction);
        customer.getBalance();
    }

    public void addCustomerNewTransaction(String customerName, double transaction) {
        validateTransaction(transaction);
        validateName(customerName);
        Customer customer = getCustomerByName(customerName);
        if (customer == null) {
            System.out.println("Customer with that name " + customerName + " is not present in list.");
            return;
        }
        customer.addTransaction(transaction);
        customer.getBalance();
    }

    public List<Double> getCustomerTransactionList(Customer customer) {
        if (!isCustomerPresentInList(customer)) {
            System.out.println("Customer with that name " + customer.getName() + " is not present in list.");
            return null;
        }
        return customer.getTransactionsList();
    }

    public List<Double> getCustomerTransactionList(String customerName) {
        validateName(customerName);
        Customer customer = getCustomerByName(customerName);
        if (customer == null) {
            System.out.println("Customer with that name " + customerName + " is not present in list.");
            return null;
        }
        return customer.getTransactionsList();
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchName='" + branchName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Branch branch = (Branch) o;

        return branchName.equals(branch.branchName);
    }

    @Override
    public int hashCode() {
        int result = branchName.hashCode();
        result = (31 * result) + 17;
        return result;
    }

    // == private methods ==
    private boolean isCustomerPresentInList(Customer customer) {
        for (Customer current : customersList) {
            if (current.equals(customer)) {
                return true;
            }
        }
        return false;
    }

    private Customer getCustomerByName(String name) {
        for (Customer current : customersList) {
            if (current.getName().equals(name)) {
                return current;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }

}
