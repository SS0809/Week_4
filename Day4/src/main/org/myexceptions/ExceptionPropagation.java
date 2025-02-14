package org.myexceptions;

import java.util.Scanner;

//6. throw vs. throws (Exception Propagation)
//        💡 Problem Statement:
//Create a method calculateInterest(double amount, double rate, int years) that:
//Throws IllegalArgumentException if amount or rate is negative.
//Propagates the exception using throws and handles it in main().
//Expected Behavior:
//If valid, return and print the calculated interest.
//If invalid, catch and display "Invalid input: Amount and rate must be positive".
public class ExceptionPropagation {
    static double calculateInterest(double amount, double rate, int years) {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        } else {
            return amount * rate * years / 100;
        }
    }

    // method calling
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount, rate, year: ");
        double amount = sc.nextDouble();
        double rate = sc.nextDouble();
        int year = sc.nextInt();

        System.out.println("Interest: " + calculateInterest(amount, rate, year));
    }
}
