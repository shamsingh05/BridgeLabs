package Inheritance.HybridInheritance.RestaurantSystem;
public class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving customers.");
    }
}
