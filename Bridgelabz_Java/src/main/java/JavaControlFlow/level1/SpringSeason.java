import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month >= 3 && month <= 5) {
            System.out.println("Spring Season");
        } else {
            System.out.println("Not Spring Season");
        }
        sc.close();
    }
}
