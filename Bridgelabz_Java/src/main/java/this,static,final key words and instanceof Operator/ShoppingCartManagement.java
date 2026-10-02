import java.util.*;

/*
 * Program to Manage Shopping Cart Products
 *
 * Problem Statement:
 * Create a Product class with the following features:
 * 1. Use a static variable discount shared by all products.
 * 2. Use a static method updateDiscount() to modify the discount percentage.
 * 3. Use this keyword to initialize productName, price, and quantity.
 * 4. Use a final variable productID so that it cannot be changed.
 * 5. Use instanceof to check whether an object is a Product
 *    before processing its details.
 *
 * The program:
 * 1. Creates a Product class.
 * 2. Defines discount as a static variable.
 * 3. Defines productName, price, and quantity as instance variables.
 * 4. Defines productID as a final variable.
 * 5. Uses this keyword in the constructor.
 * 6. Creates a static method to update the discount.
 * 7. Creates a method to display product details and calculate
 *    the discounted price.
 * 8. Uses instanceof before processing the Product object.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Cart{
    private String productName; // Instance Variable
    private double price; // Instance Variable
    private int quantity; // Instance Variable
    private static double discountPercentage = 10; // static Variable
    private final String ProductID;

    public Cart(String productName,double price,int quantity,String ProductID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.ProductID = ProductID;
    }
    public static double updateDiscount(double newDiscount){
        discountPercentage = newDiscount;
        return discountPercentage;
    }
    public void display(){
        System.out.println("The Product Name is: " + productName);
        System.out.println("Quantity is : " + quantity);
        System.out.println("The Product Price is: " + price);
        System.out.println("The Product ID is: " + ProductID);
    }
    public double calculateTotal(){
        double totalprice = price * quantity;
        double discountprice = totalprice * (discountPercentage / 100);
        double finalprice = totalprice - discountprice;
        return finalprice;
    }
}

public class ShoppingCartManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the product Name");
        String product = sc.nextLine();

        System.out.println("Enter the product price");
        double itemprice = sc.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the product ID");
        String id = sc.nextLine();

        Cart cart = new Cart(product,itemprice,quantity,id);
        if(cart instanceof Cart){
            System.out.println("\nProduct Details:");
            cart.display();
            System.out.println("Total Amount: " + cart.calculateTotal());
        }
        sc.close();
    }
}
