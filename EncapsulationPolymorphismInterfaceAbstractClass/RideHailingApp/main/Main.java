// Main class demonstrating polymorphism by calculating fares dynamically
package main;

import vehicles.*;
import interfaces.GPS;

public class Main {
    // Method demonstrating polymorphism: accepts any Vehicle type
    public static void printFare(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        double fare = vehicle.calculateFare(distance);
        System.out.println("Fare for distance " + distance + " km: " + fare);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        // Create different vehicle types
        Vehicle car = new Car("C101", "Alice", 15.0, "Downtown");
        Vehicle bike = new Bike("B202", "Bob", 8.0, "Uptown");
        Vehicle auto = new Auto("A303", "Charlie", 10.0, "Midtown");

        // Demonstrate polymorphism: Same method handles all vehicle types
        printFare(car, 10);
        printFare(bike, 10);
        printFare(auto, 10);

        // GPS functionality demo
        GPS gpsCar = (GPS) car;
        System.out.println("Car current location: " + gpsCar.getCurrentLocation());
        gpsCar.updateLocation("Airport");
        System.out.println("Car updated location: " + gpsCar.getCurrentLocation());
    }
}
