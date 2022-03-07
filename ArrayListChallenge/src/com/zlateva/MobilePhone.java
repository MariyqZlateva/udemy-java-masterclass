package com.zlateva;

import java.util.ArrayList;
import java.util.List;

// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// MobilePhone should do everything with Contact objects only.

public class MobilePhone {

    private List<Contact> contactList;

    public MobilePhone() {
        this.contactList = new ArrayList<>();
    }

    public MobilePhone(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void printContacts() {
        System.out.println("You have " + contactList.size() + " contacts");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ". " + contactList.get(i));
        }
    }

    public void addNewContact(Contact contact) {
        if (isContactPresentInList(contact)) {
            System.out.println("Contact with name " + contact.getName() + " already exists!");
            return;
        }
        contactList.add(contact);
        System.out.println("Added " + contact);
    }

    public void updateContactName(String contactName, String updatedName) {

        Contact existingContact = getContactByName(contactName);
        if (existingContact == null) {
            System.out.println("The name " + contactName + " not found");
            return;
        }

        Contact newContact = getContactByName(updatedName);
        if (newContact != null) {
            System.out.println("This name " + updatedName + " already exist");
            return;
        }
        String oldName = existingContact.getName();
        existingContact.setName(updatedName);
        System.out.println("Contact with name "+ oldName + " was updated to: "+ existingContact );
    }

    public void updateContactPhoneNumber(String contactName, long newPhoneNumber) {
        Contact contact = getContactByName(contactName);
        if (contact != null) {
            long oldNumber = contact.getPhoneNumber();
            contact.setPhoneNumber(newPhoneNumber);
            String massage = "Contact with name " + contact.getName() + " phone number was updated from: " + oldNumber + " to: " + contact.getPhoneNumber();
            System.out.println(massage);
        } else {
            System.out.println("Contact with name " + contactName + " not found");
        }
    }

    public void removeContact(String name) {
        Contact contact = getContactByName(name);
        if (contact != null) {
            removeContact(contact);
        }
    }

    public void searchContactByName(String name) {
        Contact contact = getContactByName(name);
        if (contact != null) {
            System.out.println("Found " + contact);
        } else {
            System.out.println("Contact with name " + name + " not found");
        }
    }

    public boolean isContactPresentInList(String name) {
        for (Contact current : contactList) {
            if (current.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // == private methods ==
    private void removeContact(Contact contact) {
        int position = getContactPosition(contact);
        if (position < 0) {
            System.out.println(contact + "is not found");
            return;
        }
        Contact removedContact = contactList.remove(position);
        System.out.println(removedContact + " was removed.");
    }

    private int getContactPosition(Contact contact) {
        return contactList.indexOf(contact);
    }

    private boolean isContactPresentInList(Contact contact) {
        for (Contact current : contactList) {
            if (current.equals(contact)) {
                return true;
            }
        }
        return false;
    }

    private Contact getContactByName(String name) {
        for (Contact current : contactList) {
            if (current.getName().equals(name)) {
                return current;
            }
        }
        return null;
    }

}