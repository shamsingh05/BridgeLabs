package Inheritance.SingleInheritance.LibraryManagementSystem;

// Main class to test
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author(
            "The Cosmic Voyage", 
            2023, 
            "Vatsal Agarwal", 
            "Science fiction writer exploring exoplanets and cosmic civilizations."
        );

        // Display book and author details
        author.displayInfo();
    }
}

