import java.util.*;

/*
 * Problem 5 - GCR Methods Level 1
 * Program to create a substring using charAt() method and compare it
 * with the substring created using the built-in substring() method.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class Substring {
    public static String func(String s,int start,int end){
        StringBuilder a = new StringBuilder();
        for(int i=start;i<end;i++){
            a.append(s.charAt(i));
        }
        return a.toString();
    }
    public static boolean func1(String sub,String sub_method){
        int n = sub.length();
        int m = sub_method.length();
        if(n != m){
            return false;
        }
        for(int i=0;i<n;i++){
            if(sub.charAt(i) != sub_method.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take string and start and end index as input
        String s = sc.next();
        int start = sc.nextInt();
        int end  = sc.nextInt();
        // Create substring using charAt()
        String sub = func(s,start,end);
        // Create substring using built-in substring()
        String sub_method = s.substring(start,end);
        // Compare both substrings
        boolean comp  = func1(sub,sub_method);
        if(comp){
            System.out.println("String are Same");
        }else{
            System.out.println("String are not Same");
        }
        sc.close();
    }    
}
