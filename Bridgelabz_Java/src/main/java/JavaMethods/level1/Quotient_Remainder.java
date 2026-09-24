
import java.util.Scanner;

/*
 * Problem 1 - GCR Methods Level 1
 * Write a program to take 2 numbers and print their quotient and remainder.
 *
 * Hint =>
 * Take user input as integers.
 * Use the division operator (/) to find the quotient.
 * Use the modulus operator (%) to find the remainder.
 * Write a method to find the remainder and quotient of two numbers.
 *
 * Method:
 * public static int[] findRemainderAndQuotient(int number, int divisor)
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class Quotient_Remainder {
    // Method to calculate quotient 
    static int func(int a,int b){
        return a / b;
    }

    // Method to calculate remainder
    static int func1(int a,int b){
        return a % b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input for number and divisor
        int a = sc.nextInt();
        int b =sc.nextInt();

        // Call the method
        int quotient = func(a,b);
        int remainder = func1(a,b);

        // Display quotient and remainder
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        sc.close();
    }
}
