package Inheritance.SingleInheritance.SmartHomedevicesSystem;

// Main class to test the hierarchy
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat thermostat = new Thermostat(
            "TH-101", 
            "Online", 
            22.5
        );

        // Display thermostat details
        thermostat.displayStatus();
    }
}

