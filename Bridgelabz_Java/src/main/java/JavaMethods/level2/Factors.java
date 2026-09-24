/*
 * Problem 1 - GCR Methods Level 1
 * Create a program to find the factors of a number taken as user input,
 * store the factors in an array and display the factors.
 * Also find the sum, sum of square of factors and product of the factors.
 *
 * Hint =>
 * 1. Take the input for a number
 * 2. Write a static Method to find the factors of the number and save them in an array and return the array.
 * 3. To find factors and save to array will have two loops.
 *    The first loop to find the count and initialize the array with the count.
 *    And the second loop save the factors into the array.
 * 4. Write a method to find the sum of the factors using factors array.
 * 5. Write a method to find the product of the factors using factors array.
 * 6. Write a method to find the sum of square of the factors using Math.pow() method.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Factors {

    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {

        // First loop to count the number of factors
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with exact size
        int[] factors = new int[count];

        // Second loop to store the factors
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }

        return sum;
    }

    // Method to find product of factors
    public static int findProduct(int[] factors) {

        int product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {

        double sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += Math.pow(factors[i], 2);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.println("Factors are:");

        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        // Find sum
        int sum = findSum(factors);

        // Find product
        int product = findProduct(factors);

        // Find sum of squares
        double sumOfSquares = findSumOfSquares(factors);

        // Display results
        System.out.println("\nSum of factors = " + sum);
        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumOfSquares);

        sc.close();
    }
}