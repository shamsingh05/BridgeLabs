/**
 * Vehicle Rental System:
 * - Abstract Class Vehicle: shared fields and abstract calculateRentalCost().
 * - Encapsulation: private fields, getters/setters.
 * - Interface Insurable: defines insurance-related behavior.
 * - Polymorphism: Car, Bike, Truck processed via Vehicle reference.
 */

public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rate) {
        if (rate > 0)
            this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) {
        super(num, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    public String getInsuranceDetails() {
        return "Car Insurance 10%";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) {
        super(num, "Bike", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance 5%";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) {
        super(num, "Truck", rate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance 15%";
    }
}
