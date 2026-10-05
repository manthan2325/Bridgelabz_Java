/*
 * 5. Library Management System
 * Description: Develop a library management system:
 * Use an abstract class LibraryItem with fields like itemId, title, and author.
 * Add an abstract method getLoanDuration() and a concrete method
 * getItemDetails().
 * Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with
 * specific logic.
 * Implement an interface Reservable with methods reserveItem() and
 * checkAvailability().
 * Apply encapsulation to secure details like the borrower’s personal data.
 * Use polymorphism to allow a general LibraryItem reference to manage all
 * items, regardless of type.
 * 
 * Date: 4 oct
 */

interface Reservable {
    void reserveItem();

    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    abstract int getLoanDuration(); // abstract method

    void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {

    Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() { // over ride
        return 14;
    }

    @Override
    public void reserveItem() {
        System.out.println("Book reserved");
    }

    @Override
    public boolean checkAvailability() {
        return true;
    }
}

class Magazine extends LibraryItem implements Reservable {

    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine reserved");
    }

    @Override
    public boolean checkAvailability() {
        return true;
    }
}

class DVD extends LibraryItem implements Reservable {

    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD reserved");
    }

    @Override
    public boolean checkAvailability() {
        return false;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        LibraryItem item1 = new Book(101, "Java Basics", "James");

        LibraryItem item2 = new Magazine(102, "Tech Today", "John");

        LibraryItem item3 = new DVD(103, "Java Tutorial", "Robert");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days");

        System.out.println();

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days");

        System.out.println();

        item3.getItemDetails();
        System.out.println("Loan Duration: " + item3.getLoanDuration() + " days");

        System.out.println();

        Reservable book = (Reservable) item1;

        book.reserveItem();

        System.out.println("Available: " + book.checkAvailability());
    }
}