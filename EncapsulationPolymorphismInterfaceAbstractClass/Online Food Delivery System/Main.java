
public class Main {
    public static void main(String[] args) {
        FoodItem[] order = { new VegItem("Paneer", 200, 2), new NonVegItem("Chicken", 300, 1) };
        for (FoodItem f : order) {
            double total = f.calculateTotalPrice();
            double discount = (f instanceof Discountable) ? ((Discountable) f).applyDiscount() : 0;
            System.out.println(f.getItemDetails() + " Final:" + (total - discount));
        }
    }
}
