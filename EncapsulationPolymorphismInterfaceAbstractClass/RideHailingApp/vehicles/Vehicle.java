// Abstract class representing a generic vehicle
// Demonstrates abstraction and encapsulation
package vehicles;

public abstract class Vehicle {
    // Encapsulated fields (private for data hiding)
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor to initialize common vehicle details
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters and setters (Encapsulation: controlled access)
    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public double getRatePerKm() { return ratePerKm; }
    public void setRatePerKm(double ratePerKm) { this.ratePerKm = ratePerKm; }

    // Abstract method to be overridden by subclasses for fare calculation
    public abstract double calculateFare(double distance);

    // Concrete method available to all subclasses
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm;
    }
}
