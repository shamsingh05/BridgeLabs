package Inheritance.MultiLevelInheritance.EducationalCourseHierarchy;

// Base Class: Course
public class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}
