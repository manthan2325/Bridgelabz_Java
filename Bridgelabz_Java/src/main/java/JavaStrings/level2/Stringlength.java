import java.util.*;


public class Stringlength{
    public static int func(String s){
        int cnt = 0;
        try {
            while(true){
                s.charAt(cnt);
                cnt++;
            }
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int length1 = s.length();
        int length2 = func(s);
        System.out.println("length without method: " + length2);
        System.out.println("length with method: " + length1);
        sc.close();
    }
}
