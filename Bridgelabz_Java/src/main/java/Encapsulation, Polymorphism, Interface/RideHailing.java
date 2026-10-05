/*
 * 8. Ride-Hailing Application
 * Description: Develop a ride-hailing application:
 * Define an abstract class Vehicle with fields like vehicleId, driverName, and
 * ratePerKm.
 * Add abstract methods calculateFare(double distance) and a concrete method
 * getVehicleDetails().
 * Create subclasses Car, Bike, and Auto, overriding calculateFare() based on
 * type-specific rates.
 * Use an interface GPS with methods getCurrentLocation() and updateLocation().
 * Secure driver and vehicle details using encapsulation.
 * Demonstrate polymorphism by creating a method to calculate fares for
 * different vehicle types dynamically.
 * 
 * Date: 4 oct
 */

interface GPS { // interface
    void getCurrentLocation();

    void updateLocation();
}

abstract class Vehicle { // abstract class
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    abstract double calculateFare(double distance); // abstract method

    void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: " + ratePerKm);
    }

    double getRatePerKm() {
        return ratePerKm;
    }
}

class Car extends Vehicle implements GPS {

    Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Car is currently in Chennai");
    }

    public void updateLocation() {
        System.out.println("Car location updated");
    }
}

class Bike extends Vehicle implements GPS {

    Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Bike is currently in Tambaram");
    }

    public void updateLocation() {
        System.out.println("Bike location updated");
    }
}

class Auto extends Vehicle implements GPS {

    Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Auto is currently in Chromepet");
    }

    public void updateLocation() {
        System.out.println("Auto location updated");
    }
}

class RideFare {

    static void calculateFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + vehicle.calculateFare(distance));
        System.out.println();
    }
}

public class RideHailing {

    public static void main(String[] args) {

        Vehicle car = new Car(101, "Rahul", 20);
        Vehicle bike = new Bike(102, "Arun", 10);
        Vehicle auto = new Auto(103, "Kumar", 15);

        RideFare.calculateFare(car, 10);
        RideFare.calculateFare(bike, 10);
        RideFare.calculateFare(auto, 10);

        GPS gps = (GPS) car;

        gps.getCurrentLocation();
        gps.updateLocation();
    }
}