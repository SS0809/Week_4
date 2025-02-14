package org.myexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unchecked {
    public int divideNum(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Unchecked uck = new Unchecked();
        try {
            System.out.println("Division Answer: " + uck.divideNum(scn.nextInt(), scn.nextInt()));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }
    }
}
