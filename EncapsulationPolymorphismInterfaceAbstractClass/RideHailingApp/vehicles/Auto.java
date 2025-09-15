// Auto subclass extends Vehicle and implements GPS
package vehicles;

import interfaces.GPS;

public class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    @Override
    public double calculateFare(double distance) {
        // Autos have a small base fare plus distance cost
        return distance * getRatePerKm() + 20;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
