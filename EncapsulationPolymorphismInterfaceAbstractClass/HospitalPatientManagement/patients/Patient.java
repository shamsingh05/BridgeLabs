// Abstract Patient class demonstrating encapsulation and abstraction
package patients;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient {
    // Encapsulated fields
    private String patientId;
    private String name;
    private int age;
    private String diagnosis; // Sensitive data protected by encapsulation
    private List<String> medicalHistory; // Protected list of records

    // Constructor
    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = new ArrayList<>();
    }

    // Getters and setters
    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public List<String> getMedicalHistory() { return medicalHistory; }

    // Abstract method for billing calculation
    public abstract double calculateBill();

    // Concrete method to display patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis;
    }
}
