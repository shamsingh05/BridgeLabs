// Main class demonstrating polymorphism with a list of employees
package main;

import employees.*;
import interfaces.Department;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a list of employees (polymorphic behavior: reference type is Employee)
        List<Employee> employees = new ArrayList<>();

        // Create FullTimeEmployee and PartTimeEmployee objects
        FullTimeEmployee e1 = new FullTimeEmployee("F101", "Alice", 50000, 10000);
        e1.assignDepartment("HR");

        PartTimeEmployee e2 = new PartTimeEmployee("P202", "Bob", 10000, 80, 200);
        e2.assignDepartment("IT");

        // Add to employees list using Employee reference
        employees.add(e1);
        employees.add(e2);

        // Process the list polymorphically
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());

            // Casting to Department to get department details
            Department dept = (Department) emp;
            System.out.println(dept.getDepartmentDetails());
            System.out.println("-----------------------------");
        }
    }
}
