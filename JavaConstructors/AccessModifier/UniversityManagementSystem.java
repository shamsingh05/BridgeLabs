package JavaConstructors.AccessModifier;

// Base Class
class Student {
    public int rollNumber;       // Public
    protected String name;       // Protected
    private double CGPA;         // Private

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Display method
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println();
    }
}

// Subclass
class PostgraduateStudent extends Student {
    private String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateStudent() {
        // Accessing protected and public members
        System.out.println("PG Student Name (Protected): " + name);
        System.out.println("Roll Number: " + rollNumber);  
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA()); // private accessed via getter
        System.out.println();
    }
}

// Main Class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ravi", 8.5);
        s1.displayStudent();

        // Modify CGPA using setter
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Anjali", 9.2, "Computer Science");
        pg1.displayPostgraduateStudent();
    }
}
