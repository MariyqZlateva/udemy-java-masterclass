package com.zlateva;

public class Main {

    public static void main(String[] args) {
        BankAccount defaultAccount = new BankAccount();
        System.out.println(defaultAccount.getNumber());
        System.out.println(defaultAccount.getCustomerFirstName());

        BankAccount mimiAccount = new BankAccount(800000, "mimitoooo@abv.bg", 189999999L);
        System.out.println(mimiAccount.getNumber()+" name "+mimiAccount.getCustomerFirstName());

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());

        VipCustomer vipCustomer1 = new VipCustomer("Tom", "tom@tom.com");
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Mimi", 500, "mimi@mimi.com");
        System.out.println(vipCustomer2.getName());

    }
}
