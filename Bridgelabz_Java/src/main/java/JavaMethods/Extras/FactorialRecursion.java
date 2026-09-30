/*
 * Problem 10 - Factorial Using Recursion
 *
 * Program to calculate the factorial of a number using a
 * recursive function.
 *
 * The program:
 * 1. Takes a number as input from the user.
 * 2. Uses a recursive method to calculate the factorial.
 * 3. Uses a separate method to display the result.
 *
 * Hint =>
 * 1. Create a method to take the input.
 * 2. Create a recursive method to calculate the factorial.
 * 3. The factorial of 0 is 1.
 * 4. Use the formula:
 *    factorial(n) = n * factorial(n - 1)
 * 5. Create a method to display the result.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class FactorialRecursion {

    // Method to take input
    public static int takeInput(Scanner sc) {

        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Recursive method to calculate factorial
    public static long calculateFactorial(int number) {

        // Base condition
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive call
        return number * calculateFactorial(number - 1);
    }

    // Method to display the result
    public static void displayResult(int number, long factorial) {

        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        int number = takeInput(sc);

        // Calculate factorial
        long factorial = calculateFactorial(number);

        // Display result
        displayResult(number, factorial);

        sc.close();
    }
}