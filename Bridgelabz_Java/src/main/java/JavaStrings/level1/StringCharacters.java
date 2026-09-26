import java.util.*;

/*
 * Problem 6 - GCR Methods Level 1
 * Program to return all the characters in a string using a
 * user-defined method and compare the result with the built-in
 * toCharArray() method.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class StringCharacters {
    // Method to return characters without using toCharArray()
    public static char[] func1(String s){
        int n = s.length();
        char[] result = new char[n];
        for(int i=0;i<n;i++){
            result[i] = s.charAt(i);
        }
        return result;
    }
    // Method to compare two character arrays
    public static boolean func(char[] str1,char[] str2){
        if(str1.length != str2.length){
            return false;
        }
        for(int i=0;i<str1.length;i++){
            if(str1[i] != str2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take string input
        String s = sc.next();
        // Get characters using user-defined method
        char[] manual = func1(s);
         // Get characters using built-in toCharArray()
        char[] method = s.toCharArray();
        // Compare both arrays
        boolean comp = func(manual,method);
        if(comp){
            System.out.println("Both Characters are Equal");
        }else{
            System.out.println("Both characters are not Equal");
        }
        sc.close();
    }
}
