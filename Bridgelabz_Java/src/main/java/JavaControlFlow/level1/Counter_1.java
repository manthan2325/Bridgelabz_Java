import java.util.*;

public class Counter_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            count++;
        }
        System.out.println("Count: " + count);
    }
}
