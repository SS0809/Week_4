package org.annotations.builtinannotation;
//Exercise 2: Use @Deprecated to Mark an Old Method
//✅ Problem Statement:
//Create a class LegacyAPI with an old method oldFeature(), which should not be used anymore. Instead, introduce a new method newFeature().
//        🔹 Steps to Follow:
//Define a class LegacyAPI.
//Mark oldFeature() as @Deprecated.
//Call both methods and observe the warning.

public class LegacyApi {
    @Deprecated
    void oldFeature(){
        System.out.println("Nothing");
    }
    void newFeature(){
        System.out.println("Something");
    }
    public static void main(String[] args) {
        LegacyApi la = new LegacyApi();
        la.newFeature();
        la.oldFeature();//Deprecated Warning is still used
    }
}
