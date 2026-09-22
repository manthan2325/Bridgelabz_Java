/*
 * Problem 1 - GCR Control Flow Level 3
 * Create a program to check if a number taken from the user is a Harshad Number
 * Hint =>
 * A Harshad number is an integer which is divisible by the sum of its digits.
 * For example, 21 is a Harshad number because it is perfectly divided by 3
 * (sum of digits: 2 + 1).
 * Get an integer input for the number variable.
 * Create an integer variable sum with initial value 0.
 * Use a while loop to access each digit of the number.
 * Inside the loop, find the remainder using number % 10 and add the digit to sum.
 * Remove the last digit from number using number / 10.
 * Check if the original number is perfectly divisible by the sum.
 * If the number is divisible by the sum, print Harshad Number.
 * Otherwise, print Not a Harshad Number.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */
import java.util.*;

public class HarshadNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        int m = n;
        while(n != 0){
            int a = n % 10;
            sum += a;
            n = n / 10;
        }
        if(m % sum == 0){
            System.err.println("Number is perfectly divisible");
        }else{
            System.err.println("Number is not divisible");
        }
        sc.close();
    }
}