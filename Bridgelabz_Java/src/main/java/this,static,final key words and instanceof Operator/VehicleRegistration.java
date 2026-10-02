import java.util.*;

class Vehicle{
    private String ownerName;
    private String vehicleType;
    private final String registrationNo;
    private static double registrationfee = 5000;

    public Vehicle(String ownerName,String vehicleType,String registrationNo){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNo = registrationNo;
    }
    public static void updateRegistration(double newfee){
        registrationfee = newfee;
    }
    public void display(){
        System.out.println("Owner Name is : " + ownerName);
        System.out.println("Vehicle Type is : " + vehicleType);
        System.out.println("registration No is : " + registrationNo);
        System.out.println("Registration fee is : " + registrationfee);
    }
}
public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Owner Name : ");
        String name = sc.nextLine();

        System.out.println("Enter the vehicle type : ");
        String vehicle = sc.nextLine();

        System.out.println("registration no is : ");
        String no = sc.nextLine();

        Vehicle v = new Vehicle(name,vehicle,no);

        if(v instanceof Vehicle){
            System.out.println("Car Details are : ");
            v.display();
        }
        System.out.println("Do you want to update the Registration fee ? ");
        String s = sc.next();
        if(s.equals("YES")){
            int newfee = sc.nextInt();
            Vehicle.updateRegistration(newfee);
            v.display();
        }
        sc.close();
    }
}
