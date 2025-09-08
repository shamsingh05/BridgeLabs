package JavaConstructors.InstancevsClassVariablesandMethods;

public class VehicleRegistration {

    static class Vehicle {
        String ownerName;
        String vehicleType;
        static double registrationFee = 5000; // default fee

        // Constructor
        Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        // Instance method
        void displayVehicleDetails() {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
            System.out.println();
        }

        // Class method
        static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Abhinav", "Car");
        Vehicle v2 = new Vehicle("Rohit", "Bike");

        // Display before fee update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(7000);

        // Display after fee update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
