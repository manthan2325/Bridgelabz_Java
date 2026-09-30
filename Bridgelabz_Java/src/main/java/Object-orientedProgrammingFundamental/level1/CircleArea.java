import java.util.*;

/*
 * Program to Compute Area of a Circle
 *
 * Problem Statement:
 * Create a Circle class with an attribute radius.
 * Add methods to calculate and display the area and
 * circumference of the circle.
 *
 * The program:
 * 1. Creates a Circle class.
 * 2. Defines radius as an attribute.
 * 3. Creates a method to calculate the area.
 * 4. Creates a method to calculate the circumference.
 * 5. Creates a method to display the results.
 * 6. Takes the radius as input and displays the area
 *    and circumference.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Circle{
    double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }

}
public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.println("Enter radius");
        circle.radius = sc.nextDouble();
        
        System.out.println("The area and circumfeence is ");
        circle.displayDetails();

        sc.close();
    }
}