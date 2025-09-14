package Inheritance.HybridInheritance.RestaurantSystem;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Sonia", 101);
        Waiter waiter = new Waiter("Raj", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
