// Full-time employee subclass implementing Department
package employees;

import interfaces.Department;

public class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double bonus;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    // Implement abstract method calculateSalary for full-time employee
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus; // Fixed salary + bonus
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
