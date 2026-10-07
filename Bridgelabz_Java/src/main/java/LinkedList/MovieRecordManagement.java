import java.util.Scanner;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;

    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;

        this.next = null;
        this.prev = null;
    }
}

class MovieLinkedList {

    MovieNode head;
    MovieNode tail;

    // 1. Add movie at beginning
    void insertAtBeginning(String title, String director,
                           int year, double rating) {

        MovieNode newNode =
                new MovieNode(title, director, year, rating);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 2. Add movie at end
    void insertAtEnd(String title, String director,
                     int year, double rating) {

        MovieNode newNode =
                new MovieNode(title, director, year, rating);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    // 3. Add movie at specific position
    void insertAtPosition(String title, String director,
                          int year, double rating, int position) {

        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            insertAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode newNode =
                new MovieNode(title, director, year, rating);

        MovieNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position does not exist.");
            return;
        }

        // Connect new node with next node
        newNode.next = temp.next;
        newNode.prev = temp;

        // If inserting before an existing node
        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            // Inserting at the end
            tail = newNode;
        }

        temp.next = newNode;
    }

    // 4. Delete movie by title
    void deleteByTitle(String title) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        MovieNode temp = head;

        while (temp != null &&
               !temp.title.equalsIgnoreCase(title)) {

            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Movie not found.");
            return;
        }

        // Deleting the only node
        if (temp == head && temp == tail) {
            head = null;
            tail = null;
        }

        // Deleting head
        else if (temp == head) {
            head = head.next;
            head.prev = null;
        }

        // Deleting tail
        else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        }

        // Deleting middle node
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Movie deleted.");
    }

    // 5. Search by Director
    void searchByDirector(String director) {

        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.director.equalsIgnoreCase(director)) {

                displayMovie(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found for this director.");
        }
    }

    // 6. Search by Rating
    void searchByRating(double rating) {

        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.rating == rating) {

                displayMovie(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movie found with this rating.");
        }
    }

    // 7. Display forward
    void displayForward() {

        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = head;

        System.out.println("\n===== Movies (Forward) =====");

        while (temp != null) {

            displayMovie(temp);

            temp = temp.next;
        }
    }

    // 8. Display reverse
    void displayReverse() {

        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        MovieNode temp = tail;

        System.out.println("\n===== Movies (Reverse) =====");

        while (temp != null) {

            displayMovie(temp);

            temp = temp.prev;
        }
    }

    // 9. Update rating
    void updateRating(String title, double newRating) {

        MovieNode temp = head;

        while (temp != null) {

            if (temp.title.equalsIgnoreCase(title)) {

                temp.rating = newRating;

                System.out.println("Rating updated successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    // Display one movie
    void displayMovie(MovieNode movie) {

        System.out.println("---------------------------");
        System.out.println("Movie Title: " + movie.title);
        System.out.println("Director: " + movie.director);
        System.out.println("Year: " + movie.year);
        System.out.println("Rating: " + movie.rating);
    }
}

public class MovieRecordManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieLinkedList list = new MovieLinkedList();

        int choice;

        do {

            System.out.println("\n===== Movie Management System =====");
            System.out.println("1. Add movie at beginning");
            System.out.println("2. Add movie at end");
            System.out.println("3. Add movie at position");
            System.out.println("4. Delete movie by title");
            System.out.println("5. Search by director");
            System.out.println("6. Search by rating");
            System.out.println("7. Display forward");
            System.out.println("8. Display reverse");
            System.out.println("9. Update rating");
            System.out.println("10. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter movie title: ");
                    String title1 = sc.nextLine();

                    System.out.print("Enter director: ");
                    String director1 = sc.nextLine();

                    System.out.print("Enter year: ");
                    int year1 = sc.nextInt();

                    System.out.print("Enter rating: ");
                    double rating1 = sc.nextDouble();

                    list.insertAtBeginning(
                            title1, director1, year1, rating1
                    );

                    break;

                case 2:

                    System.out.print("Enter movie title: ");
                    String title2 = sc.nextLine();

                    System.out.print("Enter director: ");
                    String director2 = sc.nextLine();

                    System.out.print("Enter year: ");
                    int year2 = sc.nextInt();

                    System.out.print("Enter rating: ");
                    double rating2 = sc.nextDouble();

                    list.insertAtEnd(
                            title2, director2, year2, rating2
                    );

                    break;

                case 3:

                    System.out.print("Enter movie title: ");
                    String title3 = sc.nextLine();

                    System.out.print("Enter director: ");
                    String director3 = sc.nextLine();

                    System.out.print("Enter year: ");
                    int year3 = sc.nextInt();

                    System.out.print("Enter rating: ");
                    double rating3 = sc.nextDouble();

                    System.out.print("Enter position: ");
                    int position = sc.nextInt();

                    list.insertAtPosition(
                            title3, director3, year3,
                            rating3, position
                    );

                    break;

                case 4:

                    System.out.print("Enter movie title to delete: ");
                    String deleteTitle = sc.nextLine();

                    list.deleteByTitle(deleteTitle);

                    break;

                case 5:

                    System.out.print("Enter director: ");
                    String searchDirector = sc.nextLine();

                    list.searchByDirector(searchDirector);

                    break;

                case 6:

                    System.out.print("Enter rating: ");
                    double searchRating = sc.nextDouble();

                    list.searchByRating(searchRating);

                    break;

                case 7:

                    list.displayForward();

                    break;

                case 8:

                    list.displayReverse();

                    break;

                case 9:

                    System.out.print("Enter movie title: ");
                    String updateTitle = sc.nextLine();

                    System.out.print("Enter new rating: ");
                    double newRating = sc.nextDouble();

                    list.updateRating(updateTitle, newRating);

                    break;

                case 10:

                    System.out.println("Program ended.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);

        sc.close();
    }
}