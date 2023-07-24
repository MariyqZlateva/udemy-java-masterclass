package com.zlateva;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class BankAccountTest {

    private BankAccount bankAccount;
    public static int count;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = "+ count++);
    }
    @org.junit.Before
    public void setup() {
        bankAccount = new BankAccount("Maria", "Zlateva", 1000.00, BankAccount.CHECKING);
        System.out.println("Running test...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance);
    }

    @org.junit.Test
    public void withdraw_branch() {
        double balance = bankAccount.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        double balance = bankAccount.withdraw(600.00, false);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        bankAccount.withdraw(200.00, true);
        assertEquals(800.00, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("Account is NOT checking account ", bankAccount.isChecking());
    }
    @AfterClass
    public static void afterClasses(){
        System.out.println("This is executes after any test cases. Count = "+ count++);
    }

    @After
    public void tearDown(){
        System.out.println("Count = "+ count++);
    }
}