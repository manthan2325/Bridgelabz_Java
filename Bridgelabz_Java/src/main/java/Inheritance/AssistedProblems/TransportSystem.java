import java.util.*;

class Vehicle{
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void display(){
        System.out.println("Vehicle Max Speed is : " + maxSpeed);
        System.out.println("The fuel type is : " + fuelType);
    }
}
class Car extends Vehicle{
    private int noSeats;
    public Car(int maxSpeed,String fuelType,int noSeats){
        super(maxSpeed,fuelType);
        this.noSeats = noSeats;
    }
    @Override
    public void display(){
        System.out.println("Vehicle: Car");
        System.out.println("The Vehicle Speed is : " + maxSpeed);
        System.out.println("The fuel Type is : " + fuelType);
        System.out.println("Seat Capacity is : " + noSeats);
    }
}
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(
        int maxSpeed,
        String fuelType,
        double loadCapacity
    ) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void display() {
        System.out.println("Vehicle: Truck");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println(
            "Load Capacity: " + loadCapacity + " tons"
        );
    }
}
class Motorcycle extends Vehicle {
    private int engineCC;

    public Motorcycle(
        int maxSpeed,
        String fuelType,
        int engineCC
    ) {
        super(maxSpeed, fuelType);
        this.engineCC = engineCC;
    }

    @Override
    public void display() {
        System.out.println("Vehicle: Motorcycle");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine: " + engineCC + " CC");
    }
}
public class TransportSystem {
    public static void main(String[] args){

        Vehicle[] vehicles = {
            new Car(200, "Petrol", 5),
            new Truck(120, "Diesel", 10),
            new Motorcycle(180, "Petrol", 350)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.display();
            System.out.println();
        }

    }
}
