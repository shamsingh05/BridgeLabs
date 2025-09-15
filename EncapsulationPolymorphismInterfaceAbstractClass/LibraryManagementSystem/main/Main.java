// Main class demonstrating polymorphism with LibraryItem references
package main;

import items.*;
import interfaces.Reservable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a list of library items (polymorphism: LibraryItem reference)
        List<LibraryItem> catalog = new ArrayList<>();

        // Create different item types
        LibraryItem book = new Book("B101", "The Alchemist", "Paulo Coelho");
        LibraryItem magazine = new Magazine("M202", "Tech Today", "Editorial Team");
        LibraryItem dvd = new DVD("D303", "Inception", "Christopher Nolan");

        catalog.add(book);
        catalog.add(magazine);
        catalog.add(dvd);

        // Display details and loan duration using polymorphism
        for (LibraryItem item : catalog) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            
            // Reserve item via interface
            Reservable reservable = (Reservable) item;
            reservable.reserveItem("John Doe");
            System.out.println("Available after reservation? " + reservable.checkAvailability());
            System.out.println("-----------------------------");
        }
    }
}
