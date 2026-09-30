import java.util.*;
/*
 * Program to Track Inventory of Items
 *
 * Problem Statement:
 * Create an Item class with attributes itemCode, itemName, and price.
 * Add a method to display item details and calculate the total cost
 * for a given quantity.
 *
 * The program:
 * 1. Creates an Item class.
 * 2. Defines itemCode, itemName, and price as attributes.
 * 3. Creates a method to display item details.
 * 4. Creates a method to calculate the total cost.
 * 5. Takes item details and quantity as input.
 * 6. Displays the item details and total cost.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

class Items{
    String itemcode;
    String itemname;
    double price;

    public double totalcost(int quantity){
        return price * quantity;
    }
    public void display(){
        System.out.println("The item code is: " + itemcode);
        System.out.println("The item name is: " + itemname);
        System.out.println("The item price is: " + price);
    }
}
public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Items items = new Items();

        System.out.println("Enter the itemcode");
        items.itemcode = sc.next();

        System.out.println("Enter the itemname");
        items.itemname = sc.next();

        System.out.println("Enter the price: ");
        items.price = sc.nextDouble();

        System.out.println("Item Details are: ");
        items.display();

        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();

        System.out.println("the total cost is " + items.totalcost(quantity));
        sc.close();
    }
}
