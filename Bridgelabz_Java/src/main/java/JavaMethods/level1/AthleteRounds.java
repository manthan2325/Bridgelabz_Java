/*
 * Problem 1 - GCR Methods Level 1
 * An athlete runs in a triangular park with sides provided as input by the user
 * in meters. If the athlete wants to complete a 5 km run, find how many rounds
 * the athlete must complete.
 *
 * Hint =>
 * Take user input for the 3 sides of the triangle.
 * Calculate the perimeter of the triangle by adding all three sides.
 * Convert the required running distance of 5 km into meters.
 * Use the formula:
 * Number of Rounds = Distance / Perimeter
 * Write a method to compute the number of rounds required to complete 5 km.
 * Finally, display the number of rounds the athlete needs to complete.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class AthleteRounds {

    // Method to calculate the number of rounds required
    static double calculateRounds(double side1, double side2, double side3) {

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert 5 km into meters
        double distance = 5000;

        // Calculate the number of rounds
        double rounds = distance / perimeter;

        return rounds;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for the three sides of the triangle
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        // Call the method to calculate the number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds
                + " rounds to complete a 5 km run.");

        sc.close();
    }
}