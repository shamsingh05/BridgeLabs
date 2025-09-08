package JavaConstructors.Level1;

public class q5 {
    static class Book {
        String title;
        String author;
        double price;
        boolean available;

        // Default constructor
        Book() {
            this.title = "Unknown";
            this.author = "Unknown";
            this.price = 0.0;
            this.available = true; // by default book is available
        }

        // Parameterized constructor
        Book(String title, String author, double price, boolean available) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = available;
        }

        // Method to borrow a book
        void borrowBook() {
            if (available) {
                available = false;
                System.out.println(title + " has been borrowed.");
            } else {
                System.out.println(title + " is not available right now.");
            }
        }

        // Method to display book details
        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: $" + price);
            System.out.println("Available: " + (available ? "Yes" : "No"));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 499.99, true);
        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 299.99, false);

        System.out.println("Initial Library State:");
        b1.display();
        b2.display();

        // Borrow attempt
        b1.borrowBook(); // should succeed
        b2.borrowBook(); // should fail (already unavailable)

        System.out.println("\nAfter Borrowing:");
        b1.display();
        b2.display();
    }
}
