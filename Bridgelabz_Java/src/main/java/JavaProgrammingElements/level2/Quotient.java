import java.util.*;

public class Quotient{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("The quotient and remainder of " + a + " and " + b + " is " + quotient + " and " + remainder + "\n");
    }
}