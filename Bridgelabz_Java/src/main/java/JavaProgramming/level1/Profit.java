package JavaProgrammingElements.level2;
import java.util.*;

public class Profit{
    public static void main(String[] args){
        int selling_price = 191;
        int cost_price = 129;
        int profit = selling_price - cost_price;
        int profit_percentage = (profit * 100) / cost_price;
        System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR " + selling_price);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profit_percentage + "\n");
    }
}