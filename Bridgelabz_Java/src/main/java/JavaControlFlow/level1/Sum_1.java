import java.util.*;


public class Sum_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(true){
            if(n == 0 || n < 0){
                break;
            }
            sum += n;
            n--;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
