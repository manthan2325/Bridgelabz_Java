import java.util.Scanner;

class CarRental{
    private String customerName;
    private String carModel;
    private double dailyRate;
    private double totalcost;

    public CarRental(String customerName, String carModel, double dailyRate, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.dailyRate = dailyRate;
        this.totalcost = rentalDays * dailyRate;
    }
    public void display(){
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.printf("Daily Rate    : Rs. %.2f%n", dailyRate);
        System.out.printf("Total Cost    : Rs. %.2f%n", totalcost);
    }

}
public class Car{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter the Car Model:");
        String model = sc.nextLine();

        System.out.println("Enter the Car Daily Rate:");
        double price = sc.nextDouble();

        System.out.println("Enter the no of days you want to ren the car");
        int days = sc.nextInt();
        
        CarRental rental = new CarRental(name,model,price,days);
        rental.display();
    }
}