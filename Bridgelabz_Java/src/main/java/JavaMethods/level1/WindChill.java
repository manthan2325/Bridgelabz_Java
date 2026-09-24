/*
 * Problem 1 - GCR Methods Level 1
 * Write a program to calculate the wind chill temperature given the
 * temperature and wind speed.
 *
 * Hint =>
 * Write a method to calculate the wind chill temperature using the formula:
 *
 * windChill = 35.74 + 0.6215 * temp
 *             + (0.4275 * temp - 35.75) * windSpeed^0.16
 *
 * Method:
 * public double calculateWindChill(double temperature, double windSpeed)
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class WindChill {

    // Method to calculate and return the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {

        double windChill = 35.74
                + (0.6215 * temperature)
                + ((0.4275 * temperature - 35.75)
                * Math.pow(windSpeed, 0.16));

        return windChill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take temperature and wind speed as input
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();

        // Call the method to calculate wind chill
        double result = calculateWindChill(temperature, windSpeed);

        // Display the wind chill temperature
        System.out.println("Wind Chill Temperature = " + result);

        sc.close();
    }
}