package org.generics.universitycoursemanagement;
//Create an abstract class CourseType
// (e.g., ExamCourse, AssignmentCourse, ResearchCourse).
public abstract class CourseType {
    private String subject;
    private String duration;
    public String getSubject() {
        return subject;
    }
    public String getDuration() {
        return duration;
    }
    public CourseType(String subject, String duration) {
        this.subject = subject;
        this.duration = duration;
    }
    public void display(){
        System.out.println("duration is : "+getDuration()+" :: subject is : "+getSubject());
    }
}
