package org.reflection.intermediate;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

//Dynamic Method Invocation:
// Define a class MathOperations with multiple public methods (add, subtract, multiply).
// Use Reflection to dynamically call any method based on user input.
public class MathOperations {
    int add(int o1 ,int o2){
        return o1+o2;
    }
    int substract(int o1 ,int o2){
        return o1-o2;
    }
    int multiply(int o1 ,int o2){
        return o1*o2;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls = Class.forName("org.reflection.intermediate.MathOperations");
        Object obj = cls.getDeclaredConstructor().newInstance();
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        System.out.println(cls.getDeclaredMethod(input,int.class,int.class).invoke(obj,scn.nextInt(),scn.nextInt()));
    }
}
