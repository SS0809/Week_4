package org.myexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

//7. finally Block Execution
//💡 Problem Statement:
//Write a program that performs integer division and demonstrates the finally block execution.
//The program should:
//Take two integers from the user.
//Perform division.
//Handle ArithmeticException (if dividing by zero).
//Ensure "Operation completed" is always printed using finally.
//Expected Behavior:
//        If valid, print the result.
//If an exception occurs, handle it and still print "Operation completed".
public class FinallyBlockExecution {
    public int divideNum(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        FinallyBlockExecution uck = new FinallyBlockExecution();
        try {
            System.out.println("Division Answer: " + uck.divideNum(scn.nextInt(), scn.nextInt()));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } finally {
            System.out.println("Operation completed");
        }
    }
}
