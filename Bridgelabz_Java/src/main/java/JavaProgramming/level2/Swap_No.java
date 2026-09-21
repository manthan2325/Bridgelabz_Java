package JavaProgrammingElements.level3;
import java.util.*;

public class Swap_No{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping the numbers are " + a + " and " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping the numbers are " + a + " and " + b);
        sc.close();
    }
}