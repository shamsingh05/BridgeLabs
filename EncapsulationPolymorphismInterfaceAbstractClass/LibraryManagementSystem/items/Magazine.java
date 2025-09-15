// Magazine subclass extending LibraryItem and implementing Reservable
package items;

import interfaces.Reservable;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            setAvailable(false);
            System.out.println("Magazine reserved for " + borrowerName);
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
