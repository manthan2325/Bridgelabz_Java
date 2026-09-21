import java.util.*;

public class NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if(n < 0){
            System.out.println("Not a Natural Number");;
        }else{
            sum = n * (n + 1) / 2;
            System.out.println("Sum of Natural Numbers upto " + n + " is: " + sum);
        }
        sc.close();
    }
}
