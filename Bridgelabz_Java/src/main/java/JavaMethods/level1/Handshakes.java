/*
 * Problem 1 - GCR Methods Level 1
 * Create a program to find the maximum number of handshakes
 * among N number of students.
 *
 * Hint =>
 * Get an integer input for the number of students.
 * Use the combination formula:
 * Number of Handshakes = (n * (n - 1)) / 2
 * Write a method to use the combination formula to calculate
 * the maximum number of possible handshakes.
 * Finally, display the maximum number of handshakes.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Handshakes {

    // Method to calculate the maximum number of handshakes
    static int calculateHandshakes(int n) {
        int handshakes = (n * (n - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the number of students as input
        int n = sc.nextInt();

        // Call the method to calculate the maximum handshakes
        int handshakes = calculateHandshakes(n);

        // Display the result
        System.out.println("The maximum number of handshakes among "
                + n + " students is " + handshakes);

        sc.close();
    }
}