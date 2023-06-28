package com.zlateva;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount( "123-3-3",1000.00);

//       Thread trThread1 = new Thread() {
//            public void run() {
//                bankAccount.deposit(300);
//                bankAccount.withdraw(50);
//            }
//        };
//
//        Thread trThread2 = new Thread(){
//            public void run() {
//                bankAccount.deposit(203.75);
//                bankAccount.withdraw(100);
//            }
//        };

        Thread trThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(300);
               bankAccount.withdraw(50);
                System.out.println("Transaction completed for account "+ bankAccount.getAccountNumber());

            }
        });

        Thread trThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(203.75);
                bankAccount.withdraw(100);
                System.out.println("Transaction completed for account "+ bankAccount.getAccountNumber());

            }
        });

        trThread1.start();
        trThread2.start();
    }
}