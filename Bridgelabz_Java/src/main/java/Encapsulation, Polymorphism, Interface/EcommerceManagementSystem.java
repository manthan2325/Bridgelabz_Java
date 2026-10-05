/*
 * 2. E-Commerce Platform
 * Description: Develop a simplified e-commerce platform:
 * Create an abstract class Product with fields like productId, name, and price,
 * and an abstract method calculateDiscount().
 * Extend it into concrete classes: Electronics, Clothing, and Groceries.
 * Implement an interface Taxable with methods calculateTax() and
 * getTaxDetails() for applicable product categories.
 * Use encapsulation to protect product details, allowing updates only through
 * setter methods.
 * Showcase polymorphism by creating a method that calculates and prints the
 * final price (price + tax - discount) for a list of Product.
 * 
 * Date: 4 oct
 */

import java.util.Scanner;

interface Taxable {
    double calculateTax();

    void getTaxDetails();
}

abstract class Product {
    int productId;
    String name;
    private double price;

    Product(int id, String name, double price) {
        productId = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { // protected
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() { // abstract method
        return getPrice() * 0.10;
    }

    public double calculateTax() { // interface method
        return getPrice() * 0.18;
    }

    public void getTaxDetails() { // interface method
        System.out.println("Electronics Tax: 18%");
    }
}

class Clothing extends Product implements Taxable {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public void getTaxDetails() {
        System.out.println("Clothing Tax: 5%");
    }
}

class Groceries extends Product {

    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class EcommerceManagementSystem {
    public static void main(String[] args) {

        Product p1 = new Electronics(101, "Laptop", 50000);
        Product p2 = new Clothing(102, "Shirt", 2000);
        Product p3 = new Groceries(103, "Rice", 1000);

        System.out.println("Laptop Final Price: " +
                (p1.getPrice() + ((Electronics) p1).calculateTax()
                        - p1.calculateDiscount()));

        System.out.println("Shirt Final Price: " +
                (p2.getPrice() + ((Clothing) p2).calculateTax()
                        - p2.calculateDiscount()));

        System.out.println("Rice Final Price: " +
                (p3.getPrice() - p3.calculateDiscount()));
    }
}