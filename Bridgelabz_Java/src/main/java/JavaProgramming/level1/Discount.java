
import java.util.*;

public class Discount{
    public static void main(String[] args){
        float org_fee = 125000;
        float discount  = (10 * 125000) / 100;
        float final_fee = org_fee - discount;
        System.out.println("The discount amount is INR " + (discount) + " and final discounted fee is INR " + final_fee + "\n");
    }
}