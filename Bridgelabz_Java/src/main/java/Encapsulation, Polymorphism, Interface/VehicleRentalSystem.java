/*
3. Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.

 * Date: 4 oct
 */

interface Insurable {
    double calculateInsurance();

    void getInsuranceDetails();
}

abstract class Vehicle {
    String VehicleNumber;
    String type;
    double rentalRate;

    Vehicle(String VehicleNumber, String type, double rentalRate) {
        this.VehicleNumber = VehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    double getrentalRate(double rentalRate) {
        return rentalRate;
    }

    abstract double calculateRentalCost(int days);
}

// child car

class Car extends Vehicle implements Insurable {

    Car(String VehicleNumber, String type, double rentalRate) {
        super(VehicleNumber, type, rentalRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getrentalRate(rentalRate) * days;
    }

    public double calculateInsurance() {
        return getrentalRate(rentalRate) * 0.1;
    }

    public void getInsuranceDetails() {
        System.out.println("The insurance rate for Car is " + " 10 percent");
    }

}

class Bike extends Vehicle implements Insurable {

    Bike(String VehicleNumber, String type, double rentalRate) {
        super(VehicleNumber, type, rentalRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getrentalRate(rentalRate) * days;
    }

    public double calculateInsurance() {
        return getrentalRate(rentalRate) * 0.05;
    }

    public void getInsuranceDetails() {
        System.out.println("The insurance rate for Bike is " + " 5 percent");
    }

}

class Truck extends Vehicle implements Insurable {

    Truck(String VehicleNumber, String type, double rentalRate) {
        super(VehicleNumber, type, rentalRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getrentalRate(rentalRate) * days;
    }

    public double calculateInsurance() {
        return getrentalRate(rentalRate) * 0.2;
    }

    public void getInsuranceDetails() {
        System.out.println("The insurance rate for Truck is " + " 20 percent");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle c1 = new Car("AP3981", "4 wheeler", 200);
        Vehicle b1 = new Bike("RJ8975", "2 weeler", 80);
        Vehicle t1 = new Truck("UP6089", "6 wheeler", 750);

        System.out.println(c1.calculateRentalCost(5));
        System.out.println(b1.calculateRentalCost(5));
        System.out.println(t1.calculateRentalCost(5));

        // casting

        Insurable car = (Insurable) c1;
        Insurable bike = (Insurable) b1;
        Insurable truck = (Insurable) t1;

        System.out.println("Car Insurance: " + car.calculateInsurance());
        car.getInsuranceDetails();

        System.out.println();

        System.out.println("Bike Insurance: " + bike.calculateInsurance());
        bike.getInsuranceDetails();

        System.out.println();

        System.out.println("Truck Insurance: " + truck.calculateInsurance());
        truck.getInsuranceDetails();
    }
}