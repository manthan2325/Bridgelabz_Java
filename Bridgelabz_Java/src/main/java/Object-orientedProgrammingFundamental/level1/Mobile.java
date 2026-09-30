import java.util.*;
/*
 * Program to Handle Mobile Phone Details
 *
 * Problem Statement:
 * Create a MobilePhone class with attributes brand, model, and price.
 * Add a method to display all the details of the phone.
 *
 * The program:
 * 1. Creates a MobilePhone class.
 * 2. Defines brand, model, and price as attributes.
 * 3. Creates a method to display all phone details.
 * 4. Takes phone details as input.
 * 5. Creates an object of the MobilePhone class.
 * 6. Displays the phone details using the method.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Phones{
    String brand;
    String model;
    double price;

    public void display(){
        System.out.println("The mobile brand is: " + brand);
        System.out.println("The mobile model is: " + model);
        System.out.println("The mobile price is: " + price);
    }
}
public class Mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phones phone = new Phones();

        System.out.println("Enter the mobile brand");
        phone.brand = sc.next();

        System.out.println("Enter the mobile model");
        phone.model = sc.next();

        System.out.println("Enter the mobile price");
        phone.price = sc.nextInt();

        System.out.println("Phone details are");
        phone.display();

        sc.close();
    }
}