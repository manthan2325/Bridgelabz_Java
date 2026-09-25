/*
 * Problem 8 - GCR Methods Level 1
 * Extend or Create a NumberChecker utility class and perform
 * different operations on the digits of a number.
 *
 * Hint =>
 * 1. Method to find the count of digits in the number.
 * 2. Method to store the digits of the number in a digits array.
 * 3. Method to check if a number is a duck number using the digits array.
 * 4. Method to check if the number is an Armstrong number using the digits array.
 * 5. Method to find the largest and second largest elements in the digits array.
 *    Use Integer.MIN_VALUE to initialize the variables.
 * 6. Method to find the smallest and second smallest elements in the digits array.
 *    Use Integer.MAX_VALUE to initialize the variables.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class NumberChecker {

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

    // Method to check whether the number is a Duck number
    public static boolean isDuckNumber(int[] digits) {

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    // Method to check whether the number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits) {

        int number = 0;

        for (int i = 0; i < digits.length; i++) {
            number = number * 10 + digits[i];
        }

        int sum = 0;
        int power = digits.length;

        for (int i = 0; i < digits.length; i++) {
            sum += (int) Math.pow(digits[i], power);
        }

        return sum == number;
    }

    // Method to find largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find count of digits
        int count = countDigits(number);

        // Store digits in array
        int[] digits = storeDigits(number);

        // Display digits
        System.out.println("Number of digits = " + count);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // Check Duck number
        if (isDuckNumber(digits)) {
            System.out.println("The number is a Duck Number.");
        } else {
            System.out.println("The number is not a Duck Number.");
        }

        // Check Armstrong number
        if (isArmstrongNumber(digits)) {
            System.out.println("The number is an Armstrong Number.");
        } else {
            System.out.println("The number is not an Armstrong Number.");
        }

        // Find largest and second largest
        int[] largestValues = findLargestAndSecondLargest(digits);

        System.out.println("Largest digit = " + largestValues[0]);
        System.out.println("Second largest digit = " + largestValues[1]);

        // Find smallest and second smallest
        int[] smallestValues = findSmallestAndSecondSmallest(digits);

        System.out.println("Smallest digit = " + smallestValues[0]);
        System.out.println("Second smallest digit = " + smallestValues[1]);

        sc.close();
    }
}