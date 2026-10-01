import java.util.*;

class Vehicle{
    private String ownerName;
    private String VehicleType;
    static double fee = 0.0;

    public Vehicle(){
        this("User","User",50.0);
    }
    public Vehicle(String ownerName,String VehicleType,double fee){
        this.ownerName = ownerName;
        this.VehicleType = VehicleType;
        Vehicle.fee = fee;
    }
    public void update(double fee){
        Vehicle.fee = fee;
    }
    public void display(){
        System.out.println("Owner Name   : " + ownerName);
        System.out.println("Vehicle Type : " + VehicleType);
        System.out.printf("Fee          : Rs. %.2f%n", fee);
    }
}
public class VehicleDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Owner Name");
        String ownerName = sc.nextLine();

        System.out.println("Enter the Vehicle Type");
        String vehicleType = sc.nextLine();

        System.out.println("Enter the Fee");
        double fee = sc.nextDouble();

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle(ownerName,vehicleType,fee);

        System.out.println("Vehicle with Non-Parameterised constructor");
        vehicle1.display();
        System.out.println("Vehicle display with parameterised constructor");
        vehicle2.display();

        System.out.println("Enter the new Fee to update");
        double newfee = sc.nextDouble();
        vehicle2.update(newfee);
        System.out.println("Vehicle display after updating the fee");
        vehicle2.display();
        sc.close(); 
    }
}
