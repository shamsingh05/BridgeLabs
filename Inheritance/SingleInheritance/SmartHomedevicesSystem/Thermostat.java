package Inheritance.SingleInheritance.SmartHomedevicesSystem;

// Subclass: Thermostat (inherits Device)
public class Thermostat extends Device {
    double temperatureSetting;

    // Constructor for Thermostat
    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus() to include thermostat-specific info
    @Override
    void displayStatus() {
        super.displayStatus(); // Show base class info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}