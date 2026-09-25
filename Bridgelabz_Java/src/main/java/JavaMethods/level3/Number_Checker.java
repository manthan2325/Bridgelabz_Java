/*
 * Problem 9 - GCR Methods Level 1
 * Extend or Create a NumberChecker utility class and perform
 * different operations on the digits of a number.
 *
 * Hint =>
 * 1. Method to find the count of digits in the number and a Method
 *    to store the digits of the number in a digits array.
 * 2. Method to find the sum of the digits of a number using the digits array.
 * 3. Method to find the sum of the squares of the digits of a number
 *    using the digits array. Use Math.pow() method.
 * 4. Method to check if a number is a Harshad number using a digits array.
 *    A number is called a Harshad number if it is divisible by the sum
 *    of its digits.
 * 5. Method to find the frequency of each digit in the number.
 *    Create a 2D array to store the frequency with digit in the first
 *    column and frequency in the second column.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Number_Checker {

    // Method to find the count of digits
    public static int countDigits(int number) {

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }

        return digits;
    }

    // Method to find sum of digits
    public static int findSum(int[] digits) {

        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        return sum;
    }

    // Method to find sum of squares of digits
    public static double findSumOfSquares(int[] digits) {

        double sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }

        return sum;
    }

    // Method to check whether number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {

        int sum = findSum(digits);

        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        // Store digits 0 to 9 in first column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find count and store digits
        int count = countDigits(number);
        int[] digits = storeDigits(number);

        // Display number of digits
        System.out.println("Number of digits = " + count);

        // Display digits
        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // Find sum
        int sum = findSum(digits);
        System.out.println("Sum of digits = " + sum);

        // Find sum of squares
        double sumOfSquares = findSumOfSquares(digits);
        System.out.println("Sum of squares = " + sumOfSquares);

        // Check Harshad number
        if (isHarshadNumber(number, digits)) {
            System.out.println("The number is a Harshad Number.");
        } else {
            System.out.println("The number is not a Harshad Number.");
        }

        // Find frequency of digits
        int[][] frequency = findDigitFrequency(digits);

        System.out.println("\nDigit Frequency:");

        for (int i = 0; i < frequency.length; i++) {

            // Display only digits that are present
            if (frequency[i][1] > 0) {
                System.out.println(
                    "Digit " + frequency[i][0]
                    + " = " + frequency[i][1] + " times"
                );
            }
        }

        sc.close();
    }
}