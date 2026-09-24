/*
 * Problem 4 - GCR Methods Level 1
 * Create a UnitConvertor utility class with static methods
 * to perform different unit conversions.
 *
 * Hint =>
 * 1. Method to convert yards to feet.
 * 2. Method to convert feet to yards.
 * 3. Method to convert meters to inches.
 * 4. Method to convert inches to meters.
 * 5. Method to convert inches to centimeters.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class UnitsConversion {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();

        // Perform conversions
        double feetResult = convertYardsToFeet(yards);
        double yardsResult = convertFeetToYards(feet);
        double inchesResult = convertMetersToInches(meters);
        double metersResult = convertInchesToMeters(inches);
        double cmResult = convertInchesToCentimeters(inches);

        // Display results
        System.out.println(yards + " yards = " + feetResult + " feet");
        System.out.println(feet + " feet = " + yardsResult + " yards");
        System.out.println(meters + " meters = " + inchesResult + " inches");
        System.out.println(inches + " inches = " + metersResult + " meters");
        System.out.println(inches + " inches = " + cmResult + " centimeters");

        sc.close();
    }
}