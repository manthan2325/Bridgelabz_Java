/*
 * Problem 5 - GCR Methods Level 1
 * Write a program Quadratic to find the roots of the equation ax2 + bx + c.
 * Use Math functions Math.pow() and Math.sqrt().
 *
 * Hint =>
 * 1. Take a, b, and c as input values to find the roots of x.
 * 2. The roots are computed using the following formulae:
 *    delta = b2 + 4*a*c
 *    If delta is positive, find the two roots.
 *    If delta is zero, there is only one root.
 *    If delta is negative, return empty array or nothing.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate delta
        double delta = Math.pow(b, 2) - (4 * a * c);

        // If delta is positive, there are two roots
        if (delta > 0) {

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            return new double[]{root1, root2};
        }

        // If delta is zero, there is one root
        else if (delta == 0) {

            double root = -b / (2 * a);

            return new double[]{root};
        }

        // If delta is negative, there are no real roots
        else {

            return new double[]{};
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input values
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display roots
        if (roots.length == 2) {
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root = " + roots[0]);
        } else {
            System.out.println("No real roots.");
        }

        sc.close();
    }
}