package Inheritance.HierarchicalInheritance.SchoolRoles;
public class Student extends Person {
    int grade;
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}
