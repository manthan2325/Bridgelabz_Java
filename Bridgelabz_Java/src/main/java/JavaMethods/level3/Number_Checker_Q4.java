/*
 * Problem 10 - GCR Methods Level 1
 * Extend or Create a NumberChecker utility class and perform
 * different operations using the digits of a number.
 *
 * Hint =>
 * 1. Method to find the count of digits in the number and a Method
 *    to store the digits of the number in a digits array.
 * 2. Method to reverse the digits array.
 * 3. Method to compare two arrays and check if they are equal.
 * 4. Method to check if a number is a palindrome using the digits.
 * 5. Method to check if a number is a duck number using the digits array.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Number_Checker_Q4 {

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {

        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to check whether the number is a palindrome
    public static boolean isPalindrome(int[] digits) {

        int[] reversed = reverseArray(digits);

        return compareArrays(digits, reversed);
    }

    // Method to check whether the number is a Duck number
    public static boolean isDuckNumber(int[] digits) {

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find count of digits
        int count = countDigits(number);
        System.out.println("Number of digits = " + count);

        // Store digits in array
        int[] digits = storeDigits(number);

        // Display digits
        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // Reverse digits
        int[] reversed = reverseArray(digits);

        System.out.print("Reversed digits: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();

        // Check palindrome
        if (isPalindrome(digits)) {
            System.out.println("The number is a Palindrome Number.");
        } else {
            System.out.println("The number is not a Palindrome Number.");
        }

        // Check Duck number
        if (isDuckNumber(digits)) {
            System.out.println("The number is a Duck Number.");
        } else {
            System.out.println("The number is not a Duck Number.");
        }

        sc.close();
    }
}