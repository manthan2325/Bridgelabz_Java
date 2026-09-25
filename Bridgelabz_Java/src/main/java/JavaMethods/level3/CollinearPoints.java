/*
 * Problem 16 - GCR Methods Level 1
 * Write a program to find whether 3 points are collinear using
 * the slope formula and area of triangle formula.
 *
 * Sample:
 * A(2,4), B(4,6) and C(6,8)
 *
 * Hint =>
 * 1. Take inputs for 3 points x1, y1, x2, y2 and x3, y3.
 * 2. Write a Method to find whether the 3 points are collinear
 *    using the slope formula.
 * 3. Write a Method to find whether the 3 points are collinear
 *    using the area of triangle formula.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean checkUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        // Calculate slope AB
        double slopeAB = (y2 - y1) / (x2 - x1);

        // Calculate slope BC
        double slopeBC = (y3 - y2) / (x3 - x2);

        // Calculate slope AC
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check whether all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle
    public static boolean checkUsingArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        // Calculate area of triangle
        double area = 0.5 * Math.abs(
                x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2)
        );

        // If area is zero, points are collinear
        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for Point A
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        // Take input for Point B
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Take input for Point C
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();

        // Check using slope
        boolean slopeResult = checkUsingSlope(
                x1, y1, x2, y2, x3, y3
        );

        // Check using area
        boolean areaResult = checkUsingArea(
                x1, y1, x2, y2, x3, y3
        );

        // Display slope result
        System.out.println("\nUsing Slope Formula:");

        if (slopeResult) {
            System.out.println("The three points are collinear.");
        } else {
            System.out.println("The three points are not collinear.");
        }

        // Display area result
        System.out.println("\nUsing Area Formula:");

        if (areaResult) {
            System.out.println("The three points are collinear.");
        } else {
            System.out.println("The three points are not collinear.");
        }

        sc.close();
    }
}