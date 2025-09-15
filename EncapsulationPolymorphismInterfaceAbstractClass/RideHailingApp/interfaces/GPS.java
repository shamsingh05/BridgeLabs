// Interface demonstrating abstraction for GPS functionality
package interfaces;

public interface GPS {
    // Get the current location of the vehicle
    String getCurrentLocation();

    // Update the vehicle's location
    void updateLocation(String newLocation);
}
