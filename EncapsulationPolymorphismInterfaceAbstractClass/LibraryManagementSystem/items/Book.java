// Book subclass extending LibraryItem and implementing Reservable
package items;

import interfaces.Reservable;

public class Book extends LibraryItem implements Reservable {

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Specific loan duration for books
    @Override
    public int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            setAvailable(false);
            System.out.println("Book reserved for " + borrowerName);
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
