
import java.util.Scanner;

public class calculator1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + a + " and " + b + " is " + sum + ", " + sub + ", " + mul + ", and " + div + "\n");
    }
}