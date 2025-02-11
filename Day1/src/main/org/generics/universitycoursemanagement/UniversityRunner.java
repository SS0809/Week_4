package org.generics.universitycoursemanagement;
//3. Multi-Level University Course Management System
//Concepts: Generic Classes, Wildcards, Bounded Type Parameters
//Problem Statement:
//Develop a university course management system where different departments offer courses with different evaluation types (e.g., Exam-Based, Assignment-Based, Research-Based).
//Hints:
//Create an abstract class CourseType (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
//Implement a generic class Course<T extends CourseType> to manage different courses.
//Use wildcards (List<? extends CourseType>) to handle any type of course dynamically.
public class UniversityRunner {
    public static void main(String[] args) {
        // creating course of different types of course
        Course<ExamCourse> examCourse = new Course<>();
        Course<AssignmentCourse> assignmentCourse = new Course<>();
        Course<ResearchCourse> researchCourse = new Course<>();

        // adding courses in each type
        examCourse.addCourse(new ExamCourse("Math", "1 Year"));
        examCourse.addCourse(new ExamCourse("Science", "1 Year"));

        assignmentCourse.addCourse(new AssignmentCourse("Coumpute science", "3 months"));
        assignmentCourse.addCourse(new AssignmentCourse("Data structure", "3 months"));

        researchCourse.addCourse(new ResearchCourse("Biology", "4 Years"));
        researchCourse.addCourse(new ResearchCourse("Space science", "4 Years"));

        // printing details of each courses
        System.out.println("Displaying exam course: ");
        Course.displayCourses(examCourse.getCourse());

        System.out.println("Displaying assignment course: ");
        Course.displayCourses(assignmentCourse.getCourse());

        System.out.println("Displaying research course: ");
        Course.displayCourses(researchCourse.getCourse());
    }
}
