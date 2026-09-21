
import java.util.*;

public class Discount2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float org_fee = sc.nextInt();
        float discount  = sc.nextInt();
        float discount_amount = (discount * org_fee) / 100;
        float final_fee = org_fee - discount_amount;
        System.out.println("The discount amount is INR " + (discount_amount) + " and final discounted fee is INR " + final_fee + "\n");
    }
}