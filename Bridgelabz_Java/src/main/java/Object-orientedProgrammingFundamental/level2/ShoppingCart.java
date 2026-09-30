
import java.util.Scanner;



class CartItem{
    private final String itemName;
    private final double price;
    private int quantity;

    public CartItem(String itemName,double price,int quantity){
        if(price < 0){
            throw new IllegalArgumentException("Price cannot be Negative");
        }
        if(quantity < 0){
            throw new IllegalArgumentException("quantity cannot be negative");
        }
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public boolean add(int count){
        if(count <= 0){
            System.out.println("Count cannot be negative or zero");
            return false;
        }
        quantity += count;
        System.out.println(count + " x " + itemName + " added.");
        return true;
    }
    public boolean remove(int count){
        if (count <= 0) {
            System.out.println("Enter a positive quantity to remove.");
            return false;
        }
        if(count > quantity){
            System.out.println("Cannot remove");
            return false;
        }
        quantity -= count;
        System.out.println(count + " x " + itemName + " removed.");
        return true;
    }
    public double getTotalcost(){
        return quantity * price;
    }
    public void display(){
        System.out.println("Item name is: " + itemName);
        System.out.printf("The Item price is Rs. %.2f%n", price);
        System.out.println("Item quantity is: " + quantity);
        System.out.printf("Total cost is Rs. %.2f%n" , getTotalcost());
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the item name");
        String name = sc.nextLine();

        System.out.println("Enter the item price");
        double price = sc.nextDouble();

        System.out.println("Enter the quantity ");
        int quantity = sc.nextInt();

        CartItem cartitem = new CartItem(name, price, quantity);
        int choice;
        do { 
            System.out.println("\n1. ADD ITEM 2. Remove Item 3. Show Total 4. Exit");
            System.out.println("Enter the choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                     System.out.println("How many to add");
                     cartitem.add(sc.nextInt());
                     break;
                case 2:
                     System.out.println("How many to remove");
                     cartitem.remove(sc.nextInt());
                     break;
                case 3:
                     cartitem.display();
                     break;
                case 4:
                     System.out.println("Good Bye");
                     break;
                default:
                     System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}