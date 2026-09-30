/*
 * Problem 11 - Temperature Converter
 *
 * Program to convert temperatures between Fahrenheit and Celsius.
 *
 * The program:
 * 1. Takes a temperature and conversion choice from the user.
 * 2. Uses a separate method to convert Fahrenheit to Celsius.
 * 3. Uses a separate method to convert Celsius to Fahrenheit.
 * 4. Displays the converted temperature.
 *
 * Hint =>
 * 1. Create a method to convert Fahrenheit to Celsius.
 * 2. Create a method to convert Celsius to Fahrenheit.
 * 3. Use the following formulas:
 *
 *    Celsius = (Fahrenheit - 32) * 5 / 9
 *    Fahrenheit = (Celsius * 9 / 5) + 32
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        if (choice == 1) {

            double result = fahrenheitToCelsius(temperature);

            System.out.println("Temperature in Celsius: " + result);

        } else if (choice == 2) {

            double result = celsiusToFahrenheit(temperature);

            System.out.println("Temperature in Fahrenheit: " + result);

        } else {

            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}