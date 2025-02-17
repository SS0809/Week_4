package org.annotations.customannotation.intermediateleve.loggingmethodexecution;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        TaskService taskService = new TaskService();

        Method taskOneMethod = TaskService.class.getMethod("taskOne");
        Method taskTwoMethod = TaskService.class.getMethod("taskTwo");
        Method taskThreeMethod = TaskService.class.getMethod("taskThree");

        System.out.println("Running taskOne:");
        ExecutionTimeLogger.logExecutionTime(taskService, taskOneMethod, null);

        System.out.println("\nRunning taskTwo:");
        ExecutionTimeLogger.logExecutionTime(taskService, taskTwoMethod, null);

        System.out.println("\nRunning taskThree:");
        ExecutionTimeLogger.logExecutionTime(taskService, taskThreeMethod, null);
    }
}
