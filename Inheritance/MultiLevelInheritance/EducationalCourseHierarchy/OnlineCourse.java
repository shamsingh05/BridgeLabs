package Inheritance.MultiLevelInheritance.EducationalCourseHierarchy;

// Subclass: OnlineCourse (extends Course)
public class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}