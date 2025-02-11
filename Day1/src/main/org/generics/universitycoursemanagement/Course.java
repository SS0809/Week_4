package org.generics.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> list = new ArrayList<>();
    public void addCourse(T course){
        list.add(course);
    }
    public List<T> getCourse(){
        return list;
    }
    public static void displayCourses(List<? extends CourseType> courses){
        for(CourseType ct : courses){
            ct.display();
        }
    }
}
