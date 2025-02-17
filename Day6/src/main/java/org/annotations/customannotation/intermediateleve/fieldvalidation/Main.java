package org.annotations.customannotation.intermediateleve.fieldvalidation;
public class Main {
    public static void main(String[] args) {
        try {
            User user = new User("LongUsername"); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            User user = new User("Short"); // Should be valid
            System.out.println("Username: " + user.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

