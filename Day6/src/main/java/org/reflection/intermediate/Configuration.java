package org.reflection.intermediate;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//Access and Modify Static Fields:
// Create a Configuration class with a private static field API_KEY.
// Use Reflection to modify its value and print it.
public class Configuration {
    private static String API_KEY= "None";
    public static void main(String[] args) throws Exception {
        Class<?> cls = Configuration.class;
        Field field = cls.getDeclaredField("API_KEY");
        Object obj = cls.getDeclaredConstructor().newInstance();
        field.set(obj,"gfyushdvc56814g8b1vfd16b8e4r96f1v8s4bchvfvcsjdbcuivewucb");
        System.out.println(field.get(obj));
    }
}
