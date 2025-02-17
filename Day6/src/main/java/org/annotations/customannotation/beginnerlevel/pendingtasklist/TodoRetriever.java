package org.annotations.customannotation.beginnerlevel.pendingtasklist;
import java.lang.reflect.Method;

public class TodoRetriever {

    public static void retrievePendingTasks(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("Method: " + method.getName());
                System.out.println("--------------------");
            }
        }
    }
}
