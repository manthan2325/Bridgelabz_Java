/*
 * Problem 1 - GCR Methods Level 1
 * Create a program to find the maximum number of handshakes
 * among N number of students.
 *
 * Hint =>
 * Get integer input for the numberOfStudents variable.
 * Use the combination formula:
 * Maximum Handshakes = (n * (n - 1)) / 2
 * Calculate the maximum number of possible handshakes.
 * Display the number of possible handshakes.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class DisplayHandshakes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get the number of students as input
        int numberOfStudents = sc.nextInt();

        // Calculate the maximum number of possible handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of handshakes is " + handshakes);

        sc.close();
    }
}