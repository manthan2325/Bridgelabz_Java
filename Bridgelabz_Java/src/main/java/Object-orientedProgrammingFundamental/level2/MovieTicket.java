import java.util.Scanner;

class Movie{
    private static final double PREMIUM_CHARGE = 100;
    private String moviename;
    private int seatno;
    private double price;
    private boolean booked;

    public Movie(String moviename,int seatno,double price){
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.moviename = moviename;
        this.seatno = seatno;
        this.price = price;
        this.booked = false;
    }
    public boolean book(int seatno,boolean ispremium){
        if(booked){
            System.out.println("Seat is already Booked");
            return false;
        }
        if(seatno <= 0){
            System.out.println("Invalid seat no");
            return false;
        }
        this.seatno = seatno;
        if(ispremium){
            this.price += PREMIUM_CHARGE;
        }
        this.booked = true;
        return true;
    }
    public void display(){
        System.out.println("Ticket details are shown");
        System.out.println("Movie Name is: " + moviename);
        if(booked){
            System.out.println("Seat: " + seatno);
        }else{
            System.out.println("Not booked yet");
        }
        System.out.println("Price is: " + price);
        System.out.println("Staus: " + (booked ? "Booked" : "Not Booked"));
    }
}
public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
            String movieName = sc.nextLine();

            System.out.print("Enter base ticket price: ");
            double basePrice = sc.nextDouble();

            System.out.print("Enter seat number: ");
            int seat = sc.nextInt();

            Movie ticket = new Movie(movieName,seat, basePrice);

            System.out.print("Premium seat? (true/false): ");
            boolean premium = sc.nextBoolean();

            if (ticket.book(seat, premium)) {
                System.out.println("Booking successful!");
            }
            ticket.display();
    }    
}
