package JavaProgrammingElements.level3;
import java.util.*;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float principal = sc.nextFloat();
        float rate = sc.nextFloat();
        float time = sc.nextFloat();
        float simple_interest = (principal * rate * time) / 100;
        System.out.println("The simple interest for principal " + principal + ", rate " + rate + " and time " + time + " is " + simple_interest);
    }
}