package com.zlateva;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Contact> contacts = new ArrayList<>();
    private static MobilePhone mobilePhone = new MobilePhone(contacts);

    static {
        contacts.add(new Contact("Mimi", 1234567890L));
        contacts.add(new Contact("Tedi", 1234567890L));
        contacts.add(new Contact("Peti", 1234567890L));
        contacts.add(new Contact("Gabi", 1234567890L));
        contacts.add(new Contact("Mishi", 1234567890L));
    }

    public static void main(String[] args) {
        processContactList();
    }//end of main method

    private static void processContactList() {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the contact list.");
        System.out.println("\t 2 - To add an contact.");
        System.out.println("\t 3 - To modify an existing contact.");
        System.out.println("\t 4 - To remove an contact.");
        System.out.println("\t 5 - To search an contact.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void addContact() {
        System.out.println("Enter contact name: ");
        String name = getString();
        System.out.println("Enter contact phoneNumber: ");
        long phoneNumber = getLong();
        Contact contact = createContact(name, phoneNumber);
        mobilePhone.addNewContact(contact);
    }

    private static Contact createContact(String name, long phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    private static void updateContact() {
        System.out.println("Current name: ");
        String name = getString();
        System.out.println("Enter new name: ");
        String newName = getString();
        mobilePhone.updateContactName(name, newName);
    }

    private static void removeContact() {
        System.out.println("Current name: ");
        String name = getString();
        mobilePhone.removeContact(name);
    }

    private static void searchForContact() {
        System.out.println("Search name: ");
        String name = getString();
        mobilePhone.searchContactByName(name);
    }

    private static long getLong() {
        while (true) {
            try {
                long number = scanner.nextLong();
                validatePhoneNumber(number);
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }

    private static String getString() {
        while (true) {
            try {
                String string = scanner.nextLine();
                validateName(string);
                return string;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void validateName(String name) {
        if (name == null) {
            throw new RuntimeException("Name can not be null");
        }
        if (name.isEmpty()) {
            throw new RuntimeException("Name can not be empty");
        }
        if (name.length() < 3 || name.length() > 30) {
            throw new RuntimeException("Name should be between 3 and 30 characters");
        }
    }

    private static void validatePhoneNumber(long phoneNumber) {
        // todo create separate function that returns the count of digits in phoneNumber
        // e.g. 1234 should return 4
        String phone = "" + phoneNumber;
        if (phone.length() != 10) {
            throw new RuntimeException("Phone number should be 10 digits long");
        }
    }

}