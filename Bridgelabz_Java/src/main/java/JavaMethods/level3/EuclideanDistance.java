/*
 * Problem 15 - GCR Methods Level 1
 * Write a program to find the Euclidean distance between two points
 * as well as the equation of the line using those two points.
 * Use Math.pow() and Math.sqrt().
 *
 * Hint =>
 * 1. Take inputs for 2 points x1, y1, x2, y2.
 * 2. Write a Method to find the Euclidean distance between two points.
 * 3. Write a Method to find the equation of a line given two points
 *    and return an array having slope m and y-intercept b.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class EuclideanDistance {

    // Method to find Euclidean distance between two points
    public static double findDistance(double x1, double y1,
                                      double x2, double y2) {

        double distance = Math.sqrt(
            Math.pow(x2 - x1, 2) +
            Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    // Method to find slope and y-intercept
    public static double[] findLineEquation(double x1, double y1,
                                             double x2, double y2) {

        // Calculate slope
        double m = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept
        double b = y1 - (m * x1);

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for first point
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Take input for second point
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Find Euclidean distance
        double distance = findDistance(x1, y1, x2, y2);

        // Find slope and y-intercept
        double[] line = findLineEquation(x1, y1, x2, y2);

        double slope = line[0];
        double yIntercept = line[1];

        // Display results
        System.out.println("\nEuclidean Distance = " + distance);
        System.out.println("Slope (m) = " + slope);
        System.out.println("Y-intercept (b) = " + yIntercept);

        // Display equation
        System.out.println("Equation of line: y = "
                + slope + "x + " + yIntercept);

        sc.close();
    }
}