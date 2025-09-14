package Inheritance.MultiLevelInheritance.EducationalCourseHierarchy;
// Main class to test
public class CourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse(
            "Java Programming", 
            8, 
            "Udemy", 
            true, 
            100.0, 
            20.0
        );

        poc.displayCourseDetails();
    }
}
