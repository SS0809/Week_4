package org.reflection.basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Invoke Private Method:
// Define a class Calculator with a private method multiply(int a, int b).
// Use Reflection to invoke this method and display the result.
public class Calculator {
    int multiple(int a , int b){
        return a*b;
    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       Calculator cl = new Calculator();
       Class<Calculator> cls = Calculator.class;
       Method method = cls.getDeclaredMethod("multiple", int.class, int.class);
       method.setAccessible(true);
       int res = (int) method.invoke(cl,5,5);
       System.out.println(res);
    }
}
