package com.zlateva;

public final class Util {

    public Util() {
    }

    static void validateName(String name) {
        if (name == null) {
            throw new RuntimeException("Name can not be null.");
        }

        if (name.isEmpty()) {
            throw new RuntimeException("Name can not be empty.");
        }
        if (name.length() < 3 || name.length() > 30) {
            throw new RuntimeException("Name should be between 3 and 30 characters.");
        }
    }

    static void validateTransaction(double transaction) {
        if (transaction < 10) {
            throw new IllegalArgumentException("The transaction can not be less than 10");
        }
    }

}
