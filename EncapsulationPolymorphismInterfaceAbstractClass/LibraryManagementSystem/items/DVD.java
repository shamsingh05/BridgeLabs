// DVD subclass extending LibraryItem and implementing Reservable
package items;

import interfaces.Reservable;

public class DVD extends LibraryItem implements Reservable {

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            setBorrower(borrowerName);
            setAvailable(false);
            System.out.println("DVD reserved for " + borrowerName);
        } else {
            System.out.println("DVD is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
