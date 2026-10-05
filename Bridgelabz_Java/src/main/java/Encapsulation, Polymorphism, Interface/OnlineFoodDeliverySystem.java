/*
 * 6. Online Food Delivery System
 * Description: Create an online food delivery system:
 * Define an abstract class FoodItem with fields like itemName, price, and
 * quantity.
 * Add abstract methods calculateTotalPrice() and concrete methods like
 * getItemDetails().
 * Extend it into classes VegItem and NonVegItem, overriding
 * calculateTotalPrice() to include additional charges (e.g., for non-veg
 * items).
 * Use an interface Discountable with methods applyDiscount() and
 * getDiscountDetails().
 * Demonstrate encapsulation to restrict modifications to order details and use
 * polymorphism to handle different types of food items in a single
 * order-processing method.
 * 
 * 
 * Date: 4 oct
 */

interface Discountable { // interface
    void applyDiscount();

    void getDiscountDetails();
}

abstract class FoodItem { // abstract class
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calculateTotalPrice();

    void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }
}

class VegItem extends FoodItem implements Discountable {

    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public void applyDiscount() {
        System.out.println("10% discount applied");
    }

    public void getDiscountDetails() {
        System.out.println("Veg items have 10% discount");
    }
}

class NonVegItem extends FoodItem implements Discountable {

    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    public void applyDiscount() {
        System.out.println("5% discount applied");
    }

    public void getDiscountDetails() {
        System.out.println("Non-Veg items have 5% discount");
    }
}

public class OnlineFoodDeliverySystem {

    static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("Total Price: " + item.calculateTotalPrice());
        System.out.println();
    }

    public static void main(String[] args) {

        FoodItem veg = new VegItem("Paneer Pizza", 200, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Pizza", 300, 2);

        processOrder(veg);
        processOrder(nonVeg);

        Discountable d1 = (Discountable) veg; // casting
        d1.applyDiscount();
        d1.getDiscountDetails();

        System.out.println();

        Discountable d2 = (Discountable) nonVeg;
        d2.applyDiscount();
        d2.getDiscountDetails();
    }
}