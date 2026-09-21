import java.util.*;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        if(n < 0 || n == 0){
            System.out.println("Please enter a positive number");
            return;
        }
        double sum = 0.0;
        while(n != 0 || n > 0){
            sum += n;
            n--;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
