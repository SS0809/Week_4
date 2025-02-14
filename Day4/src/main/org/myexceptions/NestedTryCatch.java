package org.myexceptions;

import java.util.Scanner;

//9. Nested try-catch Block
//💡 Problem Statement:
//Write a Java program that:
//Takes an array and a divisor as input.
//Tries to access an element at an index.
//Tries to divide that element by the divisor.
//Uses nested try-catch to handle:
//ArrayIndexOutOfBoundsException if the index is invalid.
//ArithmeticException if the divisor is zero.
//Expected Behavior:
//        If valid, print the division result.
//If the index is invalid, catch and display "Invalid array index!".
//If division by zero, catch and display "Cannot divide by zero!".
public class NestedTryCatch {
    int divisionOperation(int[] arr,int div,int size){
        int res = 0;
        for (int i=0;i<size;i++){
            res = arr[i]/div;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,8,9,13,1};
        Scanner scn = new Scanner(
                System.in
        );
        int divisor = scn.nextInt();

        int size = arr.length;
        NestedTryCatch nt = new NestedTryCatch();
        try {
            System.out.println(nt.divisionOperation(arr, divisor,size));
        }catch (ArithmeticException e){
            System.out.println("arithematic exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound exception");
        }
    }
}
