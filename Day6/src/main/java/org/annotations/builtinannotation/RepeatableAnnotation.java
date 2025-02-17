package org.annotations.builtinannotation;

import java.lang.annotation.*;

//Exercise 5: Create and Use a Repeatable Annotation
//✅ Problem Statement:
//Define an annotation @BugReport that can be applied multiple times on a method.
//        🔹 Steps to Follow:
//Define @BugReport with a description field.
//Use @Repeatable to allow multiple bug reports.
//Apply it twice on a method.
//Retrieve and print all bug reports.
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description() default "None";
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

public class RepeatableAnnotation {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Index out of bounds issue")
    void bugMethod() {
        System.err.println("Bug should appear");
    }

    public static void main(String[] args) {
        try {
            Method method = RepeatableAnnotation.class.getDeclaredMethod("bugMethod");

            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports reports = method.getAnnotation(BugReports.class);
                for (BugReport report : reports.value()) {
                    System.out.println("Bug Report: " + report.description());
                }
            } else {
                System.out.println("No Bug Reports found.");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
