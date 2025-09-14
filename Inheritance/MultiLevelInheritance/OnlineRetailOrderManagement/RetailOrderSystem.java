package Inheritance.MultiLevelInheritance.OnlineRetailOrderManagement;

// Main class to test
public class RetailOrderSystem {
    public static void main(String[] args) {
        // Create an order at each stage
        Order order = new Order("O101", "2025-09-10");
        ShippedOrder shipped = new ShippedOrder("O101", "2025-09-10", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("O101", "2025-09-10", "TRK12345", "2025-09-14");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
