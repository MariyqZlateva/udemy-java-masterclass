package com.zlateva;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (finedContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = finedContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else if (finedContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = finedContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    private int finedContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int finedContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (finedContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = finedContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List ");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.myContacts.get(i).getName() + " ->" +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
