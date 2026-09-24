/*
 * Problem 1 - GCR Methods Level 1
 * Write a program to find the sum of n natural numbers using a loop.
 *
 * Hint =>
 * Get an integer input from the user.
 * Write a method to find the sum of n natural numbers using a loop.
 * The method should calculate the sum of numbers from 1 to n.
 * Finally, display the sum of the n natural numbers.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class SumNaturalNumbers {

    // Method to calculate the sum of n natural numbers
    static int calculateSum(int n) {

        int sum = 0;

        // Loop from 1 to n and add each number to sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get integer input from the user
        int n = sc.nextInt();

        // Call the method to calculate the sum
        int sum = calculateSum(n);

        // Display the result
        System.out.println("The sum of " + n
                + " natural numbers is " + sum);

        sc.close();
    }
}