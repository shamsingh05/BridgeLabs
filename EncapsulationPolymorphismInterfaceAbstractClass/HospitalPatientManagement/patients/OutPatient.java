// OutPatient subclass implementing MedicalRecord interface
package patients;

import interfaces.MedicalRecord;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double testCharges;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee, double testCharges) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.testCharges = testCharges;
    }

    // Billing logic for out-patient (e.g., consultation fee + test charges)
    @Override
    public double calculateBill() {
        return consultationFee + testCharges;
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
