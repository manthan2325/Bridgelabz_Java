import java.util.*;

class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;

    // default constructor
    public HotelBooking(){
        this("User","User",0);
    }

    // paramterised Constructor
    public HotelBooking(String guestName,String roomType,int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    // Copy Constructor
    public HotelBooking(HotelBooking other){
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    // Display function to show details of the booking
    public void display(){
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }
}
public class Hotel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Create HotelBooking object using default constructor
        HotelBooking booking1 = new HotelBooking();

        System.out.println("Enter the guest name");
        String name = sc.nextLine();
        System.out.println("Enter the room type");
        String roomType = sc.nextLine();
        System.out.println("Enter the number of nights");
        int nights = sc.nextInt();
        // Create HotelBooking object using parameterized constructor
        HotelBooking booking2 = new HotelBooking(name,roomType,nights);
        // Create HotelBooking object using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);

        System.out.println("Default Constructor");
        booking1.display();
        System.out.println("Parameterized Constructor");
        booking2.display();
        System.out.println("Copy Constructor");
        booking3.display();
        sc.close();
    }
}
