package JavaConstructors.Level1;

public class q6 {
    static class CarRental {
        String customerName;
        String carModel;
        int rentalDays;
        double costPerDay;

        // Default constructor
        CarRental() {
            this.customerName = "Unknown";
            this.carModel = "Standard";
            this.rentalDays = 0;
            this.costPerDay = 1000.0; // default cost
        }

        // Parameterized constructor
        CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
            this.costPerDay = costPerDay;
        }

        // Copy constructor
        CarRental(CarRental other) {
            this.customerName = other.customerName;
            this.carModel = other.carModel;
            this.rentalDays = other.rentalDays;
            this.costPerDay = other.costPerDay;
        }

        // Method to calculate total cost
        double calculateCost() {
            return rentalDays * costPerDay;
        }

        // Display rental details
        void display() {
            System.out.println("Customer: " + customerName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Rental Days: " + rentalDays);
            System.out.println("Cost per Day: " + costPerDay);
            System.out.println("Total Cost: " + calculateCost());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Using default constructor
        CarRental r1 = new CarRental();
        
        // Using parameterized constructor
        CarRental r2 = new CarRental("Abhinav", "Hyundai Creta", 5, 2000.0);
        
        // Using copy constructor
        CarRental r3 = new CarRental(r2);

        System.out.println("Default Rental:");
        r1.display();

        System.out.println("Parameterized Rental:");
        r2.display();

        System.out.println("Copied Rental:");
        r3.display();
    }
}
