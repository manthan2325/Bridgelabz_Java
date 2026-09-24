/*
 * Problem 3 - GCR Methods Level 1
 * Write a program to take user input for 5 numbers and check whether
 * a number is positive or negative. Further for positive numbers check
 * if the number is even or odd. Finally compare the first and last
 * elements of the array and display if they are equal, greater, or less.
 *
 * Hint =>
 * 1. Write a Method to Check whether the number is positive or negative.
 * 2. Write a Method to check whether the number is even or odd.
 * 3. Write a Method to compare two numbers and return 1 if number1 > number2,
 *    0 if both are equal or -1 if number1 < number2.
 * 4. In the main program, Loop through the array using the length call the
 *    method isPositive() and if positive call method isEven() and print accordingly.
 * 5. If the number is negative, print negative.
 * 6. Finally compare the first and last element of the array by calling
 *    the method compare() and display if they are equal, greater, or less.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class NumberCheck {

    // Method to check whether number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an array of 5 numbers
        int[] numbers = new int[5];

        // Take user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {

                System.out.print(numbers[i] + " is positive");

                if (isEven(numbers[i])) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }

            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("First element is greater than last element.");
        } else if (result == 0) {
            System.out.println("First element is equal to last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        sc.close();
    }
}