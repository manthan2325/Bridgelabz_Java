import java.util.Scanner;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    TicketNode next;

    TicketNode(int ticketId, String customerName,
               String movieName, String seatNumber,
               String bookingTime) {

        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;

        this.next = null;
    }
}

class TicketReservation {

    TicketNode head;
    TicketNode tail;

    // 1. Add ticket at the end
    void addTicket(int ticketId, String customerName,
                   String movieName, String seatNumber,
                   String bookingTime) {

        TicketNode newNode = new TicketNode(
                ticketId,
                customerName,
                movieName,
                seatNumber,
                bookingTime
        );

        // Empty list
        if (head == null) {
            head = newNode;
            tail = newNode;

            // Circular connection
            tail.next = head;

            return;
        }

        // Add at end
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    // 2. Remove ticket by ID
    void removeTicket(int ticketId) {

        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        // Only one ticket
        if (head == tail) {

            if (head.ticketId == ticketId) {
                head = null;
                tail = null;

                System.out.println("Ticket removed.");
                return;
            }

            System.out.println("Ticket not found.");
            return;
        }

        // Removing head
        if (head.ticketId == ticketId) {

            head = head.next;
            tail.next = head;

            System.out.println("Ticket removed.");
            return;
        }

        // Search for ticket
        TicketNode temp = head;

        while (temp.next != head &&
               temp.next.ticketId != ticketId) {

            temp = temp.next;
        }

        // Ticket found
        if (temp.next != head) {

            TicketNode deleted = temp.next;

            temp.next = deleted.next;

            // If deleting tail
            if (deleted == tail) {
                tail = temp;
            }

            System.out.println("Ticket removed.");

        } else {
            System.out.println("Ticket not found.");
        }
    }

    // 3. Display all tickets
    void displayTickets() {

        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;

        System.out.println("\n===== BOOKED TICKETS =====");

        do {

            System.out.println("----------------------------");
            System.out.println("Ticket ID    : " + temp.ticketId);
            System.out.println("Customer     : " + temp.customerName);
            System.out.println("Movie        : " + temp.movieName);
            System.out.println("Seat Number  : " + temp.seatNumber);
            System.out.println("Booking Time : " + temp.bookingTime);

            temp = temp.next;

        } while (temp != head);
    }

    // 4. Search by customer name
    void searchByCustomer(String customerName) {

        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {

            if (temp.customerName.equalsIgnoreCase(customerName)) {

                displayTicket(temp);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for this customer.");
        }
    }

    // Search by movie name
    void searchByMovie(String movieName) {

        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {

            if (temp.movieName.equalsIgnoreCase(movieName)) {

                displayTicket(temp);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for this movie.");
        }
    }

    // Display one ticket
    void displayTicket(TicketNode ticket) {

        System.out.println("----------------------------");
        System.out.println("Ticket ID    : " + ticket.ticketId);
        System.out.println("Customer     : " + ticket.customerName);
        System.out.println("Movie        : " + ticket.movieName);
        System.out.println("Seat Number  : " + ticket.seatNumber);
        System.out.println("Booking Time : " + ticket.bookingTime);
    }

    // 5. Count total tickets
    int countTickets() {

        if (head == null) {
            return 0;
        }

        int count = 0;

        TicketNode temp = head;

        do {

            count++;
            temp = temp.next;

        } while (temp != head);

        return count;
    }
}

public class OnlineTicketReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TicketReservation system =
                new TicketReservation();

        while (true) {

            System.out.println("\n===== TICKET RESERVATION SYSTEM =====");
            System.out.println("1. Add Ticket");
            System.out.println("2. Remove Ticket");
            System.out.println("3. Display Tickets");
            System.out.println("4. Search by Customer");
            System.out.println("5. Search by Movie");
            System.out.println("6. Count Tickets");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Ticket ID: ");
                    int ticketId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();

                    System.out.print("Enter Movie Name: ");
                    String movieName = sc.nextLine();

                    System.out.print("Enter Seat Number: ");
                    String seatNumber = sc.nextLine();

                    System.out.print("Enter Booking Time: ");
                    String bookingTime = sc.nextLine();

                    system.addTicket(
                            ticketId,
                            customerName,
                            movieName,
                            seatNumber,
                            bookingTime
                    );

                    System.out.println("Ticket booked successfully.");

                    break;

                case 2:

                    System.out.print("Enter Ticket ID: ");
                    ticketId = sc.nextInt();

                    system.removeTicket(ticketId);

                    break;

                case 3:

                    system.displayTickets();

                    break;

                case 4:

                    System.out.print("Enter Customer Name: ");
                    customerName = sc.nextLine();

                    system.searchByCustomer(customerName);

                    break;

                case 5:

                    System.out.print("Enter Movie Name: ");
                    movieName = sc.nextLine();

                    system.searchByMovie(movieName);

                    break;

                case 6:

                    System.out.println(
                            "Total booked tickets: "
                            + system.countTickets()
                    );

                    break;

                case 7:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}