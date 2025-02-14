package org.myexceptions;
import java.util.Scanner;

//8. Exception Propagation in Methods
//💡 Problem Statement:
//Create a Java program with three methods:
//method1(): Throws an ArithmeticException (10 / 0).
//method2(): Calls method1().
//main(): Calls method2() and handles the exception.
//Expected Behavior:
//The exception propagates from method1() → method2() → main().
//Catch and handle it in main(), printing "Handled exception in main".
public class ExceptionPropogationMethod {
    public int method1(int n1, int n2) {
        System.out.println("Method1");
        return n1 / n2;
    }
    public int method2(int n1,int n2){
        System.out.println("Method2");
        return method1(n1,n2);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ExceptionPropogationMethod uck = new ExceptionPropogationMethod();
        try {
            System.out.println("Division Answer: " + uck.method2(scn.nextInt(), scn.nextInt()));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0!");
        } finally {
            System.out.println("Handled exception in main");
        }
    }
}
