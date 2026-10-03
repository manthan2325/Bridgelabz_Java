import java.util.*;


class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled with petrol.");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {

        ElectricVehicle electric =
                new ElectricVehicle(180, "Tesla Model 3");

        PetrolVehicle petrol =
                new PetrolVehicle(200, "Honda City");

        electric.displayInfo();
        electric.charge();

        System.out.println();

        petrol.displayInfo();
        petrol.refuel();
    }
}