
import java.util.Scanner;

public class trianglearea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = (base * height) / 2;
        System.out.println("The area of triangle with base " + base + " and height " + height + " is " + area);
    }
}