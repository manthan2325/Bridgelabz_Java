package JavaProgrammingElements.level2;
import java.util.*;

public class TotalPrice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int unit_amount = sc.nextInt();
        int total_amount = units * unit_amount;
        System.out.println("The total purchase price is INR " + total_amount + " if the quantity is " + units + " and unit price is INR " + unit_amount + "\n");
    }
}