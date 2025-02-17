package org.annotations.customannotation.intermediateleve.loggingmethodexecution;
import java.lang.reflect.Method;

public class ExecutionTimeLogger {

    public static void logExecutionTime(Object obj, Method method, Object[] args) throws Exception {
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long startTime = System.nanoTime();
            method.invoke(obj, args);
            long endTime = System.nanoTime();
            System.out.println(method.getName() + " execution time: " + (endTime - startTime) + " nanoseconds");
        }
    }
}
