import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0){
            count++;
            n--;
        }
        System.out.println("Count: " + count);
    }
}
