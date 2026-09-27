import java.util.*;

public class Palindrome {
    public static boolean func(String s,int start,int end){
        if(start >= end){
            return false;
        }
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean func1(String s,int start,int end){
        if(start >= end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return func1(s,start+1,end-1);
    }
    public static boolean checkPalindromeUsingArrays(String text) {

        // Create reverse String using charAt()
        String reverse = reverseString(text);

        // Convert both Strings into character arrays
        char[] originalArray = text.toCharArray();
        char[] reverseArray = reverse.toCharArray();

        // Compare both arrays
        for (int i = 0; i < originalArray.length; i++) {

            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }

        return true;
    }
     public static String reverseString(String text) {

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        return reverse;
    }
    public static boolean func2(String text) {

        // Create reverse String using charAt()
        String reverse = reverseString(text);

        // Convert both Strings into character arrays
        char[] originalArray = text.toCharArray();
        char[] reverseArray = reverse.toCharArray();

        // Compare both arrays
        for (int i = 0; i < originalArray.length; i++) {

            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean result1 = func(s,0,n-1);
        boolean result2 = func1(s,0,n-1);
        boolean result3 = func2(s);
         System.out.println("\nPalindrome Check Results:");

        System.out.println("Using Loop: " +
                (result1 ? "Palindrome" : "Not a Palindrome"));

        System.out.println("Using Recursion: " +
                (result2 ? "Palindrome" : "Not a Palindrome"));

        System.out.println("Using Character Arrays: " +
                (result3 ? "Palindrome" : "Not a Palindrome"));

        sc.close();

    }    
}
