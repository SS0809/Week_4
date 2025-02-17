package org.reflection.basic;

import java.lang.reflect.Field;

//Access Private Field: Create a class Person with a private field age. Use Reflection to modify and retrieve its value.
public class Person {
    int age=15;
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person();
        Class<Person> cls = Person.class;
        Field temp_age = cls.getDeclaredField("age");
        temp_age.setAccessible(true);
        temp_age.set(p,10);
        System.out.println(p.age);
    }
}
