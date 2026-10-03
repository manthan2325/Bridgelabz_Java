import java.util.*;
class Orders{
    protected String orderId;
    protected String orderDate;

    public Orders(String orderId,String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public void display(){
        System.out.println("Order Id is : " + orderId);
        System.out.println("orderDate is : " + orderDate);
    }
}
class ShippedOrder extends Orders{
    protected String trackingNumber;

    public ShippedOrder(String orderId,String orderDate,String trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber = trackingNumber;
    }
    public void display(){
        System.out.println("Order Id is : " + orderId);
        System.out.println("orderDate is : " + orderDate);
        System.out.println("Ord1er tracking No is : " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(String orderId,String orderDate,String trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public  void display(){
        System.out.println("Order Id is : " + orderId);
        System.out.println("orderDate is : " + orderDate);
        System.out.println("Order tracking No is : " + trackingNumber);
        System.out.println("Order delivery date is : " + deliveryDate);
    }
}
public class OnlineOrder {
    public static void main(String[] args){
        Orders order = new Orders("101", "01-10-2026");
        ShippedOrder shippedOrder =
                new ShippedOrder("102", "02-10-2026", "TRK12345");
        DeliveredOrder deliveredOrder =
                new DeliveredOrder("103", "03-10-2026",
                                   "TRK67890", "05-10-2026");

     order.display();
     shippedOrder.display();        
     deliveredOrder.display();
    }
}
