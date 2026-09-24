/*
 * Problem 1 - GCR Methods Level 1
 * Write a program to find the smallest and the largest of the 3 numbers.
 *
 * Hint =>
 * Take user input for 3 numbers.
 * Write a single method to find the smallest and largest of the three numbers.
 * The method should return an integer array containing the smallest and
 * largest numbers.
 *
 * Method:
 * public static int[] findSmallestAndLargest(int number1, int number2, int number3)
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class SmallestLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        // Check for the smallest number
        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        // Check for the largest number
        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        // Store smallest and largest in an array
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for three numbers
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        // Call the method and store the returned array
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the smallest and largest numbers
        System.out.println("Smallest number = " + result[0]);
        System.out.println("Largest number = " + result[1]);

        sc.close();
    }
}