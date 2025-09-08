package JavaConstructors.InstancevsClassVariablesandMethods;

public class ProductInventory {
    
    static class Product {
        String productName;
        double price;
        static int totalProducts = 0;  // class variable

        // Constructor
        Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++;  // increase whenever a product is created
        }

        // Instance method
        void displayProductDetails() {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println();
        }

        // Class method
        static void displayTotalProducts() {
            System.out.println("Total Products: " + totalProducts);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Smartphone", 25000);
        Product p3 = new Product("Headphones", 2000);

        // Display details
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total products
        Product.displayTotalProducts();
    }
}
