// Abstract LibraryItem class demonstrating encapsulation and abstraction
package items;

public abstract class LibraryItem {
    // Encapsulated fields
    private String itemId;
    private String title;
    private String author;
    private String borrower; // Sensitive data protected by encapsulation
    private boolean isAvailable;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // default: available
        this.borrower = "";
    }

    // Getters and setters
    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getBorrower() { return borrower; }
    public void setBorrower(String borrower) { this.borrower = borrower; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { this.isAvailable = available; }

    // Abstract method for loan duration
    public abstract int getLoanDuration();

    // Concrete method to get details
    public String getItemDetails() {
        return "Item ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}
