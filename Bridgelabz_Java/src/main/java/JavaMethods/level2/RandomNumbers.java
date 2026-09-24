/*
 * Problem 6 - GCR Methods Level 1
 * Write a program that generates five 4 digit random values
 * and then finds their average, minimum and maximum value.
 * Use Math.random(), Math.min(), and Math.max().
 *
 * Hint =>
 * 1. Write a method that generates an array of 4 digit random numbers
 *    given the size as a parameter.
 * 2. Write a method to find average, min and max value of an array.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class RandomNumbers {

    // Method to generate 4 digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {

            // Generate random number between 1000 and 9999
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        // Generate 5 random 4 digit numbers
        int[] numbers = generate4DigitRandomArray(5);

        // Display random numbers
        System.out.println("Generated 4 digit random numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Find average, minimum and maximum
        double[] result = findAverageMinMax(numbers);

        // Display results
        System.out.println("\nAverage = " + result[0]);
        System.out.println("Minimum = " + result[1]);
        System.out.println("Maximum = " + result[2]);
    }
}