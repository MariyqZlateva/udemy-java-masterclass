package com.zlateva;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 1750.05);
        bank.addCustomer("Adelaide", "Percy", 250.05);

        bank.addBranch("Sidney");
        bank.addCustomer("Sidney", "Bob", 150.09);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Mike", 44.22);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sidney", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brain", 5.53)) {
            System.out.println("Error Melbourne branch does not exist!");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 89.0)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 12.09)) {
            System.out.println("Customer Tim already exists.");
        }
    }
}
