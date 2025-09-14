package Inheritance.SingleInheritance.LibraryManagementSystem;

// Subclass: Author (inherits from Book)
public class Author extends Book {
    String name;
    String bio;

    // Constructor for Author
    Author(String title, int publicationYear, String name, String bio) {
        // Call the superclass (Book) constructor
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo() to include author details
    @Override
    void displayInfo() {
        super.displayInfo(); // Display book details
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}
