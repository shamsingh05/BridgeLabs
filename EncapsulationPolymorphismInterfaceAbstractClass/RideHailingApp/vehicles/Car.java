// Car subclass extends Vehicle and implements GPS
package vehicles;

import interfaces.GPS;

public class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    // Overriding abstract method: fare calculation specific to Car
    @Override
    public double calculateFare(double distance) {
        // Cars may have an additional fixed charge
        return distance * getRatePerKm() + 50;
    }

    // GPS interface methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
