package Inheritance.SingleInheritance.SmartHomedevicesSystem;

// Superclass: Device
public class Device {
    String deviceId;
    String status;

    // Constructor for Device
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display general device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}