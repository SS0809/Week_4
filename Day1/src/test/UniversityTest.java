import org.generics.universitycoursemanagement.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityTest {
    // creating course of different types of course
    Course<ExamCourse> examCourse = new Course<>();
    Course<AssignmentCourse> assignmentCourse = new Course<>();
    Course<ResearchCourse> researchCourse = new Course<>();
    @BeforeEach
    void setup(){//ARRANGE
        // adding courses in each type
        examCourse.addCourse(new ExamCourse("Math", "1 Year"));
        examCourse.addCourse(new ExamCourse("Science", "1 Year"));

        assignmentCourse.addCourse(new AssignmentCourse("Coumpute science", "3 months"));
        assignmentCourse.addCourse(new AssignmentCourse("Data structure", "3 months"));

        researchCourse.addCourse(new ResearchCourse("Biology", "4 Years"));
        researchCourse.addCourse(new ResearchCourse("Space science", "4 Years"));
    }
    @Test
    void test() {//ACT
        // printing details of each courses
        System.out.println("Displaying exam course: ");
        Course.displayCourses(examCourse.getCourse());

        System.out.println("Displaying assignment course: ");
        Course.displayCourses(assignmentCourse.getCourse());

        System.out.println("Displaying research course: ");
        Course.displayCourses(researchCourse.getCourse());
    }


    @Test
    void test2(){
        String expected = "Product: SmartPhone X, Price: $999.99, Category: Smartphones, Description: Latest flagship smartphone";
    }
}
