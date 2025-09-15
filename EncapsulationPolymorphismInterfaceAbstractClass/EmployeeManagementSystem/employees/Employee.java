// Abstract class Employee demonstrating encapsulation and abstraction
package employees;

public abstract class Employee {
    // Encapsulated fields (private for restricted access)
    private String employeeId;
    private String name;
    private double baseSalary;

    // Constructor to initialize employee details
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and setters for encapsulated fields
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract method for salary calculation to be implemented by subclasses
    public abstract double calculateSalary();

    // Concrete method to display common details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}
