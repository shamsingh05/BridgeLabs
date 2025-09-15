public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(1, "Laptop", 1000),
                new Clothing(2, "Shirt", 50),
                new Groceries(3, "Apple", 2)
        };
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}