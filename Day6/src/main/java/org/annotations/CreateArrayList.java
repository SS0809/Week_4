package org.annotations;

import java.util.ArrayList;

//Exercise 3: Suppress Unchecked Warnings
//✅ Problem Statement:
//Create an ArrayList without generics and use @SuppressWarnings("unchecked") to hide compilation warnings.
public class CreateArrayList {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Saurabh");
        arr.add(0);
        System.out.println(arr);
    }
}
