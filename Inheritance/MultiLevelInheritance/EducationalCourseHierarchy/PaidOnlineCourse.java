package Inheritance.MultiLevelInheritance.EducationalCourseHierarchy;

// Subclass: PaidOnlineCourse (extends OnlineCourse)
public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        double finalFee = fee - (fee * discount / 100);
        System.out.println("Final Fee after Discount: $" + finalFee);
    }
}
