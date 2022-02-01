package com.zlateva;

public class VipCustomer {

    private String name;
    private long creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name", 2000, "Default mail");
      //  System.out.println("This is vip customer empty constructor");
    }

    public VipCustomer(String name, String email) {
        this(name, 50000L, email);
        //System.out.println("This is vip customer constructor with default credit limit "+ creditLimit);
    }

    public VipCustomer(String name, long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
