// MedicalRecord interface for managing patient medical records
package interfaces;

public interface MedicalRecord {
    // Add a record to the patient's medical history
    void addRecord(String record);

    // View all medical records
    void viewRecords();
}
