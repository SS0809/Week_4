package org.myexceptions;
import java.util.Scanner;
class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {
    void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        CustomException ce = new CustomException();

        try {
            System.out.print("Enter your age: ");
            int age = scn.nextInt();
            ce.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scn.close();
        }
    }
}
