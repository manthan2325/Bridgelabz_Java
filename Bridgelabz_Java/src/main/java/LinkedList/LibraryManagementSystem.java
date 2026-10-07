import java.util.Scanner;

class BookNode {
    String bookTitle;
    String author;
    String genre;
    int bookId;
    boolean available;

    BookNode next;
    BookNode prev;

    BookNode(String bookTitle, String author, String genre,
             int bookId, boolean available) {

        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;

        this.next = null;
        this.prev = null;
    }
}

class Library {
    BookNode head;
    BookNode tail;

    // 1. Add at beginning
    void addAtBeginning(String title, String author, String genre,
                        int id, boolean available) {

        BookNode newNode = new BookNode(title, author, genre, id, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 2. Add at end
    void addAtEnd(String title, String author, String genre,
                  int id, boolean available) {

        BookNode newNode = new BookNode(title, author, genre, id, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    // 3. Add at specific position
    void addAtPosition(String title, String author, String genre,
                        int id, boolean available, int position) {

        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }

        BookNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        BookNode newNode = new BookNode(title, author, genre, id, available);

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    // 4. Remove by Book ID
    void removeById(int id) {

        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

        // If deleting first node
        if (temp == head) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }

            return;
        }

        // If deleting last node
        if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        // If deleting middle node
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    // 5. Search by title
    void searchByTitle(String title) {

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.bookTitle.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Search by author
    void searchByAuthor(String author) {

        BookNode temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found by this author");
        }
    }

    // 6. Update availability
    void updateAvailability(int id, boolean available) {

        BookNode temp = head;

        while (temp != null) {

            if (temp.bookId == id) {
                temp.available = available;
                System.out.println("Availability updated");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // 7. Display forward
    void displayForward() {

        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // 8. Display reverse
    void displayReverse() {

        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = tail;

        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // 9. Count books
    int countBooks() {

        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Display one book
    void displayBook(BookNode book) {

        System.out.println("----------------------------");
        System.out.println("Book ID     : " + book.bookId);
        System.out.println("Title       : " + book.bookTitle);
        System.out.println("Author      : " + book.author);
        System.out.println("Genre       : " + book.genre);
        System.out.println("Availability: "
                + (book.available ? "Available" : "Not Available"));
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT =====");
            System.out.println("1. Add at beginning");
            System.out.println("2. Add at end");
            System.out.println("3. Add at position");
            System.out.println("4. Remove by Book ID");
            System.out.println("5. Search by Title");
            System.out.println("6. Search by Author");
            System.out.println("7. Update Availability");
            System.out.println("8. Display Forward");
            System.out.println("9. Display Reverse");
            System.out.println("10. Count Books");
            System.out.println("11. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                case 3:

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();

                    System.out.print("Available? (true/false): ");
                    boolean available = sc.nextBoolean();

                    if (choice == 1) {
                        library.addAtBeginning(
                                title, author, genre, id, available);
                    }
                    else if (choice == 2) {
                        library.addAtEnd(
                                title, author, genre, id, available);
                    }
                    else {
                        System.out.print("Enter position: ");
                        int position = sc.nextInt();

                        library.addAtPosition(
                                title, author, genre,
                                id, available, position);
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    library.removeById(id);
                    break;

                case 5:

                    System.out.print("Enter Book Title: ");
                    title = sc.nextLine();

                    library.searchByTitle(title);
                    break;

                case 6:

                    System.out.print("Enter Author: ");
                    author = sc.nextLine();

                    library.searchByAuthor(author);
                    break;

                case 7:

                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    System.out.print("Available? (true/false): ");
                    available = sc.nextBoolean();

                    library.updateAvailability(id, available);
                    break;

                case 8:

                    library.displayForward();
                    break;

                case 9:

                    library.displayReverse();
                    break;

                case 10:

                    System.out.println(
                            "Total books: " + library.countBooks());
                    break;

                case 11:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice");
            }
        }
    }
}