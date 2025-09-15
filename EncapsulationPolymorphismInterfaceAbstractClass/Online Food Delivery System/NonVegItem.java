public class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return 120 * priceFactor();
    }

    private double priceFactor() {
        return 1.2;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;
    }

    public String getDiscountDetails() {
        return "10% Non-Veg discount";
    }
}
