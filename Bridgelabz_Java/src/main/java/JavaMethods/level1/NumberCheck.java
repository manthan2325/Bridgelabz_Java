/*
 * Problem 1 - GCR Methods Level 1
 * Write a program to check whether a number is positive, negative, or zero.
 *
 * Hint =>
 * Get an integer input from the user.
 * Write a method to check whether the number is positive, negative, or zero.
 * The method should return -1 for a negative number.
 * The method should return 1 for a positive number.
 * The method should return 0 if the number is zero.
 * Finally, display the result based on the value returned by the method.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class NumberCheck {

    // Method to check whether the number is positive, negative, or zero
    static int checkNumber(int number) {

        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get integer input from the user
        int number = sc.nextInt();

        // Call the method and store the returned value
        int result = checkNumber(number);

        // Display the result
        if (result == -1) {
            System.out.println("Negative Number");
        } else if (result == 1) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}