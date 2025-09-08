package JavaConstructors.AccessModifier;

class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + this.salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
}

class Manager extends Employee {
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Manager mgr = new Manager("M001", "Sales", 75000);

        mgr.displayManagerInfo();
        System.out.println("Current Salary: " + mgr.getSalary());
        mgr.setSalary(80000);
        System.out.println("Updated Salary: " + mgr.getSalary());
    }
}
