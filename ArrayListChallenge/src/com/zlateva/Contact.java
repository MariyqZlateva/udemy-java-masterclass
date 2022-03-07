package com.zlateva;

public class Contact {

    private String name;
    private long phoneNumber;

    public Contact(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact " +
                "name='" + name + '\'' +
                ", phoneNumber= " + phoneNumber +";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Contact contact = (Contact) o;

        return name.equals(contact.getName());
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = (31 * result) + 17;
        return result;
    }
}