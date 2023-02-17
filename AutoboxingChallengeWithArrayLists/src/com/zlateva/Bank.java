package com.zlateva;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Customer> customerList;

    public Bank(String name) {
        this(name, new ArrayList<>());
    }

    public Bank(String name, ArrayList<Customer> customers) {
        this.bankName = name;
        this.customerList = customers;
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Customer> getCustomerList() {
        return new ArrayList<>(customerList);
    }

    public void addNewCustomerWithInitialTransaction(String customerName, double initialTransaction) {
        if (getCustomerByName(customerName) != null) {
            System.out.println("Customer with customerName " + customerName + " is exist");
            return;
        }
        Customer customer = new Customer(customerName, initialTransaction);
        customerList.add(customer);
    }

    public void addNewCustomerWithInitialTransaction(Customer customer) {
        if (isCustomerPresentInList(customer)) {
            System.out.println("Customer with name " + bankName + " is exist");
        } else {
            customerList.add(customer);
        }
    }

    public void addTransactionToAnExistingCustomer(String customerName, double transaction) {
        Customer customer = getCustomerByName(customerName);
        if (customer == null) {
            System.out.println("Customer with name " + customerName + " is not present in list");
            return;
        }
        customer.addTransactions(transaction);
        customer.getBalance();
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + bankName + '\'' +
                ", customers=" + customerList +
                '}';
    }

    public void getCustomerList(String customerName, boolean withTransactions) {
        Customer customer = getCustomerByName(customerName);
        if (customer == null) {
            System.out.println("Customer with name " + customerName + " doesnt exist.");
            return;
        }
        ArrayList<Customer> customers = getCustomerList();
        for (Customer customer1 : customerList) {
            System.out.println(customer);
            if (withTransactions) {
                ArrayList<Double> transactionsList = customer.getTransactionList();
                for (Double transactions : transactionsList) {
                    System.out.println("\t " + transactions);
                }
            }
        }
    }

    private boolean isCustomerPresentInList(String name) {
        for (Customer customer1 : customerList) {
            if (customer1.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCustomerPresentInList(Customer customer) {
        return isCustomerPresentInList(customer.getName());
    }

    private Customer getCustomerByName(String customerName) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
