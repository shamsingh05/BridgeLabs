package JavaConstructors.Level1;

public class q1 {
    static class Book {
        String title;
        String author;
        double price;

        // Default constructor
        Book() {
            title = "Unknown";
            author = "Unknown";
            price = 0.0;
        }

        // Parameterized constructor
        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: $" + price);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.display();

        Book book2 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        book2.display();
    }
}
