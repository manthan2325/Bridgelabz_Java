import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.println(
            "Product: " + name + " | Price: " + price
        );
    }
}

class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    // Aggregation
    public void addProduct(Product product) {
        products.add(product);
    }

    public void display() {
        System.out.println("Order ID: " + orderId);

        for (Product product : products) {
            product.display();
        }
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Association + Communication
    public void placeOrder(Order order) {
        orders.add(order);

        System.out.println(
            name + " placed Order " + order.getOrderId()
        );
    }

    public void displayOrders() {
        System.out.println("Orders of " + name + ":");

        for (Order order : orders) {
            order.display();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {

        // Products exist independently
        Product laptop = new Product("Laptop", 60000);
        Product mouse = new Product("Mouse", 1000);
        Product keyboard = new Product("Keyboard", 2000);

        // Orders exist independently
        Order order1 = new Order(101);
        Order order2 = new Order(102);

        // Customer
        Customer customer = new Customer("Chaitanya");

        // Aggregation: Order contains existing Products
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        order2.addProduct(keyboard);
        order2.addProduct(mouse);

        // Association + Communication
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        System.out.println();

        customer.displayOrders();
    }
}