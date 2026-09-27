/*
 * Problem 24 - GCR Methods Level 1
 *
 * Program to calculate the Body Mass Index (BMI) of a group of
 * persons and display their height, weight, BMI and BMI status.
 *
 * The program:
 * 1. Takes the number of persons as input.
 * 2. Takes the weight in kg and height in cm for each person.
 * 3. Stores the weight and height in a 2D array.
 * 4. Converts height from centimetres to metres.
 * 5. Calculates BMI using the formula:
 *    BMI = weight / (height * height)
 * 6. Determines the BMI status of each person.
 * 7. Stores height, weight, BMI and status in a 2D String array.
 * 8. Displays the details of all persons in a tabular format.
 *
 * BMI Status:
 * Below 18.5  -> Underweight
 * 18.5 - 24.9 -> Normal
 * 25.0 - 29.9 -> Overweight
 * 30.0 and above -> Obese
 *
 * Hint =>
 * 1. Take weight and height as input and store them in a 2D array.
 *    First column stores weight and second column stores height in cm.
 * 2. Create a method to calculate the BMI and determine the status.
 * 3. Create a method to store height, weight, BMI and status in
 *    a 2D String array.
 * 4. Create a method to display the 2D String array in tabular format.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */
import java.util.Scanner;

public class BMI {

    // Method to find BMI status
    public static String bmistatus(double bmi) {

        if (bmi < 18.5) {
            return "Underweight";

        } else if (bmi < 25) {
            return "Normal";

        } else if (bmi < 30) {
            return "Overweight";

        } else {
            return "Obese";
        }
    }

    // Method to calculate BMI and store height, weight, BMI and status
    public static String[][] func1(double[][] arr) {

        int n = arr.length;

        String[][] temp = new String[n][4];

        for (int i = 0; i < n; i++) {

            double weight = arr[i][0];
            double heightincm = arr[i][1];

            // Convert height from cm to metres
            double heightinm = heightincm / 100;

            // Calculate BMI
            double bmi = weight / (heightinm * heightinm);

            // Store height, weight, BMI and status
            temp[i][0] = String.valueOf(heightincm);
            temp[i][1] = String.valueOf(weight);
            temp[i][2] = String.valueOf(bmi);
            temp[i][3] = bmistatus(bmi);
        }

        return temp;
    }

    // Method to display the result
    public static void func2(String[][] result) {

        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    result[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] arr = new double[n][2];

        // Take weight and height
        for (int i = 0; i < n; i++) {

            arr[i][0] = sc.nextDouble(); // Weight
            arr[i][1] = sc.nextDouble(); // Height
        }

        // Calculate BMI
        String[][] result = func1(arr);

        // Display result
        func2(result);

        sc.close();
    }
}