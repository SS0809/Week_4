package org.reflection.intermediate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;

//Retrieve Annotations at Runtime
//Create a custom annotation @Author(name="Author Name").
// Apply it to a class and use Reflection to retrieve and display the annotation value at runtime.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author{
    String name() default "None";
}
@Author(name="Saurabh")
public class RetrieveAnnotation {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> cls = RetrieveAnnotation.class;
        System.out.println(cls.getAnnotation(Author.class).name());
    }
}
