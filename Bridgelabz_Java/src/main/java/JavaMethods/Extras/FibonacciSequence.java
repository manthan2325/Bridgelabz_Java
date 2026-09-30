/*
 * Problem 8 - Fibonacci Sequence Generator
 *
 * Program to generate the Fibonacci sequence up to a specified
 * number of terms entered by the user.
 *
 * The Fibonacci sequence starts with 0 and 1. Each next number
 * is the sum of the previous two numbers.
 *
 * The program:
 * 1. Takes the number of terms from the user.
 * 2. Calls a separate method to generate the Fibonacci sequence.
 * 3. Prints each term of the sequence.
 *
 * Hint =>
 * 1. Create a method to calculate and print the Fibonacci sequence.
 * 2. Start with the first two numbers as 0 and 1.
 * 3. Calculate the next number by adding the previous two numbers.
 * 4. Repeat the process for the required number of terms.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class FibonacciSequence {

    // Method to generate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= terms; i++) {

            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        // Call the Fibonacci method
        generateFibonacci(terms);

        sc.close();
    }
}