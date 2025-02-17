package org.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;



//Get Class Information: Write a program to accept a class name as input and display its methods, fields, and constructors using Reflection.
public class GetClassInfo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String className = scn.nextLine();// (e.g., java.util.ArrayList)
        try {
            Class<?> cls = Class.forName(className);
            System.out.println("printed : " + cls.getName());
            for (Method method : cls.getDeclaredMethods()) {
                System.out.println("  " + method);
            }
            for (Field field : cls.getDeclaredFields()) {
                System.out.println("  " + field);
            }
            for (Constructor constructor : cls.getConstructors()) {
                System.out.println("  " + constructor);
            }
            System.out.println("printed : " + cls.getName());
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
}

