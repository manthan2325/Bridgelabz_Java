/*
 * Problem 3 - GCR Methods Level 1
 * Create a UnitConvertor utility class with static methods
 * to perform different unit conversions.
 *
 * Hint =>
 * 1. Method to convert kilometers to miles.
 * 2. Method to convert miles to kilometers.
 * 3. Method to convert meters to feet.
 * 4. Method to convert feet to meters.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class UnitConvertor {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();

        // Perform conversions
        double milesResult = convertKmToMiles(km);
        double kmResult = convertMilesToKm(miles);
        double feetResult = convertMetersToFeet(meters);
        double metersResult = convertFeetToMeters(feet);

        // Display results
        System.out.println(km + " km = " + milesResult + " miles");
        System.out.println(miles + " miles = " + kmResult + " km");
        System.out.println(meters + " meters = " + feetResult + " feet");
        System.out.println(feet + " feet = " + metersResult + " meters");

        sc.close();
    }
}