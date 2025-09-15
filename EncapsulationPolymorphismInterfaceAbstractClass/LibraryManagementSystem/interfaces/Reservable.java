// Reservable interface for reserving items and checking availability
package interfaces;

public interface Reservable {
    // Reserve the library item for a borrower
    void reserveItem(String borrowerName);

    // Check if the item is available for reservation
    boolean checkAvailability();
}
