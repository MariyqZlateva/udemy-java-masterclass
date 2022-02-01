package com.zlateva;

public class BankAccount {

    private long number;
    private String customerFirstName;
    private String customerLastName;
    private long balance;
    private String mailAddress;
    private long phoneNumber;

    public BankAccount() {
        this(123, "Default first name", "Default last name", 12345, "Default email", 1222);
        System.out.println("Empty constructor called");
    }

    public BankAccount(long balance, String mailAddress, long phoneNumber) {
        this(125, "Mimi", "Eval", balance, mailAddress, phoneNumber);
    }


    public BankAccount(long number, String customerFirstName, String customerLastName,
                       long balance, String mailAddress, long phoneNumber) {
        System.out.println("BankAccount constructor with parameters was called");
        this.number = number;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.balance = balance;
        this.mailAddress = mailAddress;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(long funds) {
        this.balance += funds;
        System.out.println("Deposit of " + funds + " made." + " New balance is " + this.balance);
    }

    public void withdrawFunds(long withdraw) {
        if (withdraw > this.balance) {
            System.out.println("The balance is not enough");
        } else {
            this.balance -= withdraw;
            System.out.println("After withdraw " + withdraw + ", you have " + this.balance);
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String eMailAddress) {
        this.mailAddress = eMailAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
