package org.annotations.builtinannotation;
import java.lang.annotation.*;
//Exercise 4: Create a Custom Annotation and Use It
//✅ Problem Statement:
//Create a custom annotation @TaskInfo to mark tasks with priority and assigned person.
//        🔹 Steps to Follow:
//Define an annotation @TaskInfo with fields priority and assignedTo.
//Apply this annotation to a method in TaskManager class.
//Retrieve the annotation details using Reflection API.

@Retention(RetentionPolicy.RUNTIME) //level of annotation source | compile | runtime
@Target({ElementType.TYPE})// FOR CLASS USAGE
@interface MarkPriority{
    int priority() default  0;
    String assignedTo() default "None";
}
@MarkPriority(priority=5,assignedTo="Saurabh")
public class TaskManager  {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        Class<? extends TaskManager> c= tm.getClass();
//        System.out.println(c.getName());
        MarkPriority an =(MarkPriority) c.getAnnotation(MarkPriority.class);
//        System.out.println(an.annotationType());
        System.out.println("Priority : "+ an.priority());
        System.out.println("AssignedTo : "+ an.assignedTo());

    }
}
