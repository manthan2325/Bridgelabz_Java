/*
 * Problem 5 - GCR Methods Level 1
 * Create a UnitConvertor utility class with static methods
 * to perform different unit conversions.
 *
 * Hint =>
 * 1. Method to convert Fahrenheit to Celsius.
 * 2. Method to convert Celsius to Fahrenheit.
 * 3. Method to convert pounds to kilograms.
 * 4. Method to convert kilograms to pounds.
 * 5. Method to convert gallons to liters.
 * 6. Method to convert liters to gallons.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Weights {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter Fahrenheit: ");
        double farhenheit = sc.nextDouble();

        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter kilograms: ");
        double kilograms = sc.nextDouble();

        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();

        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();

        // Perform conversions
        double celsiusResult = convertFarhenheitToCelsius(farhenheit);
        double farhenheitResult = convertCelsiusToFarhenheit(celsius);
        double kilogramsResult = convertPoundsToKilograms(pounds);
        double poundsResult = convertKilogramsToPounds(kilograms);
        double litersResult = convertGallonsToLiters(gallons);
        double gallonsResult = convertLitersToGallons(liters);

        // Display results
        System.out.println(farhenheit + " Fahrenheit = " + celsiusResult + " Celsius");
        System.out.println(celsius + " Celsius = " + farhenheitResult + " Fahrenheit");
        System.out.println(pounds + " pounds = " + kilogramsResult + " kilograms");
        System.out.println(kilograms + " kilograms = " + poundsResult + " pounds");
        System.out.println(gallons + " gallons = " + litersResult + " liters");
        System.out.println(liters + " liters = " + gallonsResult + " gallons");

        sc.close();
    }
}