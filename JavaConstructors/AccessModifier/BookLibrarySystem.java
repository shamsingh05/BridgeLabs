package JavaConstructors.AccessModifier;

// Base class
class Book {
    public String ISBN;       // Public
    protected String title;   // Protected
    private String author;    // Private

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display details
    public void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}

// Subclass
class EBook extends Book {
    private double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBook() {
        // Public ISBN accessible directly
        System.out.println("E-Book ISBN (Public): " + ISBN);

        // Protected title accessible in subclass
        System.out.println("E-Book Title (Protected): " + title);

        // Private author accessed via getter
        System.out.println("Author (via Getter): " + getAuthor());

        System.out.println("File Size: " + fileSize + " MB");
        System.out.println();
    }
}

// Main class
public class BookLibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("978-93-325-1234-5", "The Alchemist", "Paulo Coelho");
        b1.displayBook();

        // Update author via setter
        b1.setAuthor("P. Coelho");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();

        EBook eb1 = new EBook("978-93-325-6789-0", "Java Programming", "James Gosling", 5.2);
        eb1.displayEBook();
    }
}
