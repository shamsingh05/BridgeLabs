package Inheritance.HybridInheritance.RestaurantSystem;
public class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking dishes.");
    }
}
