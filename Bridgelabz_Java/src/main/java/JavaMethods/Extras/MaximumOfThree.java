/*
 * Problem 6 - Maximum of Three Numbers
 *
 * Program to take three integer inputs from the user and find
 * the maximum of the three numbers.
 *
 * The program:
 * 1. Takes three integer values from the user.
 * 2. Uses a separate method to take the input values.
 * 3. Uses another method to find the maximum value.
 * 4. Displays the maximum of the three numbers.
 *
 * Hint =>
 * 1. Create a method to take three integer inputs.
 * 2. Create a method to find the maximum of three numbers.
 * 3. Compare the three numbers and return the largest value.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class MaximumOfThree {

    // Method to take three integer inputs
    public static int[] takeInput(Scanner sc) {

        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();

        return numbers;
    }

    // Method to find the maximum of three numbers
    public static int findMaximum(int[] numbers) {

        int maximum = numbers[0];

        if (numbers[1] > maximum) {
            maximum = numbers[1];
        }

        if (numbers[2] > maximum) {
            maximum = numbers[2];
        }

        return maximum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        int[] numbers = takeInput(sc);

        // Find maximum
        int maximum = findMaximum(numbers);

        // Display result
        System.out.println("Maximum number: " + maximum);

        sc.close();
    }
}