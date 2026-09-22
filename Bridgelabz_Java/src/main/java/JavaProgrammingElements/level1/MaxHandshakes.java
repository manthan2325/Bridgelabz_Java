
import java.util.*;

public class MaxHandshakes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes that can occur in a room with " + n + " people is " + max_handshakes + "\n");
    }
}