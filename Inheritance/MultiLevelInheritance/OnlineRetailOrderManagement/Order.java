package Inheritance.MultiLevelInheritance.OnlineRetailOrderManagement;
// Base Class: Order
public class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}