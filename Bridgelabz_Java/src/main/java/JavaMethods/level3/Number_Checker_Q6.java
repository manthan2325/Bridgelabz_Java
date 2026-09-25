/*
 * Problem 12 - GCR Methods Level 1
 * Extend or Create a NumberChecker utility class and perform
 * different operations using the factors of a number.
 *
 * Hint =>
 * 1. Method to find factors of a number and return them as an array.
 *    There are 2 for loops: one for the count and another for
 *    finding the factors and storing them in the array.
 * 2. Method to find the greatest factor of a number using the factors array.
 * 3. Method to find the sum of the factors using factors array.
 * 4. Method to find the product of the factors using factors array.
 * 5. Method to find product of cube of the factors using Math.pow().
 * 6. Method to check if a number is a perfect number.
 * 7. Method to check if a number is an abundant number.
 * 8. Method to check if a number is a deficient number.
 * 9. Method to check if a number is a strong number.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Number_Checker_Q6 {

    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {

        // First loop to count the factors
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array using the factor count
        int[] factors = new int[count];

        // Second loop to find and store factors
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {

        return factors[factors.length - 1];
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }

        return sum;
    }

    // Method to find the product of factors
    public static long findProductOfFactors(int[] factors) {

        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        return product;
    }

    // Method to find product of cube of factors
    public static long findProductOfCubeOfFactors(int[] factors) {

        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= (long) Math.pow(factors[i], 3);
        }

        return product;
    }

    // Method to check whether the number is a Perfect Number
    public static boolean isPerfectNumber(int number, int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {

            // Exclude the number itself
            if (factors[i] != number) {
                sum += factors[i];
            }
        }

        return sum == number;
    }

    // Method to check whether the number is an Abundant Number
    public static boolean isAbundantNumber(int number, int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {

            // Exclude the number itself
            if (factors[i] != number) {
                sum += factors[i];
            }
        }

        return sum > number;
    }

    // Method to check whether the number is a Deficient Number
    public static boolean isDeficientNumber(int number, int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {

            // Exclude the number itself
            if (factors[i] != number) {
                sum += factors[i];
            }
        }

        return sum < number;
    }

    // Method to find factorial of a digit
    public static int factorial(int digit) {

        int factorial = 1;

        for (int i = 1; i <= digit; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Method to check whether the number is a Strong Number
    public static boolean isStrongNumber(int number) {

        int originalNumber = number;
        int sum = 0;

        while (number != 0) {

            int digit = number % 10;

            sum += factorial(digit);

            number = number / 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");

        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println();

        // Find greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor = " + greatestFactor);

        // Find sum of factors
        int sum = findSumOfFactors(factors);
        System.out.println("Sum of factors = " + sum);

        // Find product of factors
        long product = findProductOfFactors(factors);
        System.out.println("Product of factors = " + product);

        // Find product of cubes of factors
        long cubeProduct = findProductOfCubeOfFactors(factors);
        System.out.println("Product of cube of factors = " + cubeProduct);

        // Check Perfect Number
        if (isPerfectNumber(number, factors)) {
            System.out.println("The number is a Perfect Number.");
        } else {
            System.out.println("The number is not a Perfect Number.");
        }

        // Check Abundant Number
        if (isAbundantNumber(number, factors)) {
            System.out.println("The number is an Abundant Number.");
        } else {
            System.out.println("The number is not an Abundant Number.");
        }

        // Check Deficient Number
        if (isDeficientNumber(number, factors)) {
            System.out.println("The number is a Deficient Number.");
        } else {
            System.out.println("The number is not a Deficient Number.");
        }

        // Check Strong Number
        if (isStrongNumber(number)) {
            System.out.println("The number is a Strong Number.");
        } else {
            System.out.println("The number is not a Strong Number.");
        }

        sc.close();
    }
}