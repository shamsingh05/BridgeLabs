public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car("C123", 1000), new Bike("B234", 500), new Truck("T345", 2000) };
        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " Rental:" + v.calculateRentalCost(5));
            System.out.println(((Insurable) v).getInsuranceDetails() + " Cost:" + ((Insurable) v).calculateInsurance());
        }
    }
}