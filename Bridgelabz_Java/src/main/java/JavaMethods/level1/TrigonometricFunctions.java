/*
 * Problem 1 - GCR Methods Level 1
 * Write a program to calculate various trigonometric functions using
 * the Math class given an angle in degrees.
 *
 * Hint =>
 * Write a method to calculate various trigonometric functions.
 * First, convert the angle from degrees to radians.
 * Use the Math class to calculate sine, cosine, and tangent.
 * Return the calculated values in a double array.
 *
 * Method:
 * public static double[] calculateTrigonometricFunctions(double angle)
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return all three values in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take angle in degrees as input
        double angle = sc.nextDouble();

        // Call the method
        double[] result = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.println("Sine = " + result[0]);
        System.out.println("Cosine = " + result[1]);
        System.out.println("Tangent = " + result[2]);

        sc.close();
    }
}