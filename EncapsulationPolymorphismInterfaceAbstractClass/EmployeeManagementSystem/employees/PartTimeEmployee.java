// Part-time employee subclass implementing Department
package employees;

import interfaces.Department;

public class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Implement abstract method calculateSalary for part-time employee
    @Override
    public double calculateSalary() {
        // Base salary is considered a minimum retainer + hourly wage
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    // Department interface methods
    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
