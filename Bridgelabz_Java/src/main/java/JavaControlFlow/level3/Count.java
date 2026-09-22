import java.util.*;

/*
 * Problem 1 - GCR Control Flow Level 3
 * Create a program to count the number of digits in an integer
 * Hint =>
 * Get an integer input for the number variable.
 * Create an integer variable count with value 0.
 * Use a loop to iterate until number is not equal to 0.
 * Remove the last digit from number in each iteration.
 * Increase count by 1 in each iteration.
 * Finally display the count to show the number of digits.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0){
            count++;
            n = n / 10;
        }
        System.err.println(count);
        sc.close();
    } 
}
