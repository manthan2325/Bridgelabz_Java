import java.util.*;

/*
 * Program to Manage Product Details
 *
 * Problem Statement:
 * Create a Product class with instance variables productName and price.
 * Create a class variable totalProducts that is shared among all
 * Product objects.
 *
 * The program:
 * 1. Creates a Product class.
 * 2. Defines productName and price as instance variables.
 * 3. Defines totalProducts as a class variable using static.
 * 4. Increments totalProducts whenever a Product object is created.
 * 5. Creates an instance method to display product details.
 * 6. Creates a class method to display the total number of products.
 * 7. Creates multiple Product objects and displays their details.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Producttt{
    // Instance variables: Each Product object has its own values
    private String productName;
    private double price;
    
    // Class variable: Shared by all Product objects
    static int totalproducts;

    public Producttt(){
        this("Item",0.0);
    }
    public Producttt(String productName,double price){
        this.productName = productName;
        this.price = price;
        totalproducts++;
    }
    public void displayProductDetails(){
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
    }
    public static void displayTotalProducts(){
        System.out.println("Total Products : " + totalproducts);
    }

}
public class ProductDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Create the first Product object
        System.out.println("Enter the product name:");
        String name = sc.nextLine();

         // Create the second Product object
        System.out.println("Enter the product price: ");
        double price = sc.nextDouble();

        Producttt p1 = new Producttt(name,price);
        Producttt p2 = new Producttt(name,price);

        /*
         * Display the details of each Product object.
         * The instance method works on the individual object.
         */

        p1.displayProductDetails();
        p2.displayProductDetails();

        Producttt.displayTotalProducts();

        sc.close();
    }
}
