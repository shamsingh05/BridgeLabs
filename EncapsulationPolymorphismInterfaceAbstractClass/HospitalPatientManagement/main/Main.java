// Main class demonstrating polymorphism with Patient types
package main;

import patients.*;
import interfaces.MedicalRecord;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List of patients using polymorphism
        List<Patient> patients = new ArrayList<>();

        // Create an InPatient and OutPatient
        InPatient p1 = new InPatient("IP101", "Alice", 45, "Pneumonia", 5, 2000);
        p1.addRecord("Admitted for severe pneumonia.");
        p1.addRecord("Completed antibiotic course.");
        
        OutPatient p2 = new OutPatient("OP202", "Bob", 30, "Fever", 500, 1500);
        p2.addRecord("Consulted for fever and weakness.");
        p2.addRecord("Blood tests performed.");

        // Add patients to list
        patients.add(p1);
        patients.add(p2);

        // Process patients dynamically using polymorphism
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());
            System.out.println("Total Bill: " + p.calculateBill());
            
            // Interface methods
            MedicalRecord record = (MedicalRecord) p;
            record.viewRecords();
            System.out.println("----------------------------");
        }
    }
}
