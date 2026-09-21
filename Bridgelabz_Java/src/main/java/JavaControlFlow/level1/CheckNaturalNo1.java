import java.util.*;

public class CheckNaturalNo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Not a prime Number");
        }else{
            int a = 0;
            int b = n * (n + 1) / 2;
            for(int i=0;i<=n;i++){
                a += i;
                i++;
            }
            if(a == b){
                System.out.println("Sum of Natural Numbers from both methods are same");
            }else{
                System.out.println("Sum of Natural Numbers from both methods are not same");
            }
        }
        sc.close();
    }
}