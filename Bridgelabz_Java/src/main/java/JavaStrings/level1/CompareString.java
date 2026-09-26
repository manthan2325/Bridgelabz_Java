/*
 * Problem 4 - GCR Methods Level 1
 * Program to compare two strings using charAt() method
 * and compare the result with the built-in equals() method.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class CompareString { 

    // Method to compare two strings using charAt()
    public static boolean func(String a,String b){
    int n = a.length();
    int m = b.length();
    if(n != m){
        return false;
    }
    for(int i=0;i<n;i++){
        if(a.charAt(i) != b.charAt(i)){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take two strings as input
        String a = sc.next();
        String b = sc.next();
        // Compare using charAt()
        boolean comp = func(a,b);
        // Check whether both methods give the same result
        if(comp){
            System.out.println("String are Equal");
        }else{
            System.out.println("String are not Equal");
        }
        sc.close();
    }
}
