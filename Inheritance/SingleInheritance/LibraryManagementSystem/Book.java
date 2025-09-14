package Inheritance.SingleInheritance.LibraryManagementSystem;

// Superclass: Book
public class Book {
    String title;
    int publicationYear;

    // Constructor for Book
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}