import java.util.*;

/*
 * Problem 1 - GCR Methods Level 1
 * Create a program to calculate Simple Interest.
 * Hint =>
 * Simple Interest = Principal * Rate * Time / 100.
 * Take user input for Principal, Rate, and Time.
 * Create a method to calculate the Simple Interest.
 * Pass Principal, Rate, and Time as parameters to the method.
 * Calculate the Simple Interest inside the method.
 * Return the calculated Simple Interest.
 * Finally, display the Simple Interest along with the Principal,
 * Rate of Interest, and Time.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class SimpleInterest {
    static int func(int principal,int rate,int time){
        int simple_interest = (principal*rate*time) / 100;
        return simple_interest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input for Principal, Rate, and Time
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

         // Call the method and store the calculated Simple Interest
        int st = func(principal,rate,time);
        
         // Display the result
        System.err.println(st);
        sc.close();
    }
}