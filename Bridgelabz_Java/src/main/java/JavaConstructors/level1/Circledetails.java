import java.util.Scanner;

/*
 * Program to Demonstrate Constructor Chaining in Circle
 *
 * Problem Statement:
 * Write a Circle class with a radius attribute.
 * Use constructor chaining to initialize radius with
 * default and user-provided values.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Circle {
    private double radius;

    // default constructor chaining to parameterized constructor
    public Circle(){
        this(1.0);
    }

    // parameterized constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //display method to print radius
    public void display(){
        System.out.println("Radius of Circle is : " + radius);
    }

};
public class Circledetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Circle object using default constructor
        Circle circle = new Circle();
        
        System.out.println("Enter the radius of Circle");
        double user_Radius = sc.nextDouble();
        // Create Circle object using parameterized constructor
        Circle circle1 = new Circle(user_Radius);
        System.out.println("Circle with Default Constructor");
        circle.display();
        System.out.println("Circle with Parameterised Constructor");
        circle1.display();
        sc.close();
    }
}
