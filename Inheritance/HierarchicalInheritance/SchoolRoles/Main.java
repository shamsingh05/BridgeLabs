package Inheritance.HierarchicalInheritance.SchoolRoles;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anita", 35, "Mathematics");
        Student student = new Student("Rahul", 14, 9);
        Staff staff = new Staff("Mr. Kumar", 40, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
