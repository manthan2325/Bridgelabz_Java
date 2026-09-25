/*
 * Problem 2 - GCR Methods Level 1
 * Program to generate marks for Physics, Chemistry and Maths
 * and calculate total, average and percentage.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class StudentScoreCard {

    // Generate random marks for all students
    public static int[][] generateScores(int n) {

        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = 10 + (int)(Math.random() * 90); // Physics
            marks[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            marks[i][2] = 10 + (int)(Math.random() * 90); // Maths
        }

        return marks;
    }

    // Calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;

            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Display the final scorecard
    public static void displayScoreCard(int[][] marks, double[][] result) {

        System.out.println("\nStudent Score Card");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t\t" +
                marks[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "%"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateScores(n);

        double[][] result = calculateResults(marks);

        displayScoreCard(marks, result);

        sc.close();
    }
}