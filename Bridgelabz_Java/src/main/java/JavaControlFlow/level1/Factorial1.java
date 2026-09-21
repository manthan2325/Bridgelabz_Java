import java.util.*;

public class Factorial1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        for(int i=n;i>=1;i--){
            prod *= i;
        }
        System.out.println(prod);
        sc.close();
    }
}
