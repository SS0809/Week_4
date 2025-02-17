package org.annotations.customannotation.beginnerlevel.markimportantmethods;
import java.lang.reflect.Method;

public class ImportantMethodRetriever {

    public static void retrieveImportantMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Level: " + importantMethod.level());
                System.out.println("--------------------");
            }
        }
    }
}
