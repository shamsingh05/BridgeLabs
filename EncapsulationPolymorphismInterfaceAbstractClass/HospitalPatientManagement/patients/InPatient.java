// InPatient subclass implementing MedicalRecord interface
package patients;

import interfaces.MedicalRecord;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    // Billing logic for in-patient (e.g., daily rate * days admitted)
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    // Add record to medical history
    @Override
    public void addRecord(String record) {
        getMedicalHistory().add(record);
    }

    // View all records
    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":");
        for (String rec : getMedicalHistory()) {
            System.out.println("- " + rec);
        }
    }
}
