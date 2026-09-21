import java.util.*;

public class OddorEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i % 2 == 0){
                System.out.println("Even Number:" + i);
            }else{
                System.out.println("Odd Number" + i);
            }
        }
        sc.close();
    }
}
