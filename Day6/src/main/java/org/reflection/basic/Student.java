package org.reflection.basic;

import java.lang.reflect.InvocationTargetException;

//Dynamically Create Objects: Write a program to create an instance of a
// Student class dynamically using Reflection without using the new keyword.
public class Student {
    void something(){
        System.out.println("Something");
    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> stu = Class.forName("org.reflection.basic.Student");
        Object obj = stu.getDeclaredConstructor().newInstance();
        stu.getDeclaredMethod("something").invoke(obj);
    }
}
