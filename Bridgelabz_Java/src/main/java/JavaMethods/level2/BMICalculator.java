/*
 * Problem 4 - GCR Methods Level 1
 * An organization wants to find the Body Mass Index (BMI)
 * of all the persons in a team of 10 members.
 * Find and display the height, weight, BMI and status of each individual.
 *
 * Hint =>
 * 1. Take user input in double for the weight (in kg) and height (in cm)
 *    and store it in a 2D array of 10 rows and 3 columns.
 *    First column stores weight, second column stores height in cm,
 *    and third column stores BMI.
 * 2. Create a Method to find the BMI of every person and populate the array.
 *    BMI = weight / (height * height)
 *    Convert height from cm to meter.
 * 3. Create a Method to determine the BMI status and return the array
 *    of all persons' BMI status.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class BMICalculator {

    // Method to calculate BMI for every person
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            // Convert height from cm to meters
            double heightInMeter = data[i][1] / 100;

            // Calculate BMI
            double bmi = data[i][0] / (heightInMeter * heightInMeter);

            // Store BMI in third column
            data[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create 2D array
        // Column 0 = Weight, Column 1 = Height, Column 2 = BMI
        double[][] data = new double[10][3];

        // Take input for 10 persons
        for (int i = 0; i < data.length; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kg: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height in cm: ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Get BMI status
        String[] status = getBMIStatus(data);

        // Display results
        System.out.println("\nBMI Details");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < data.length; i++) {

            System.out.println(
                "Person " + (i + 1)
                + " | Weight: " + data[i][0] + " kg"
                + " | Height: " + data[i][1] + " cm"
                + " | BMI: " + data[i][2]
                + " | Status: " + status[i]
            );
        }

        sc.close();
    }
}