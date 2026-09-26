/*
 * Problem 23 - GCR Methods Level 1
 *
 * Program to generate marks for Physics, Chemistry and Maths (PCM),
 * calculate the total, average and percentage, and assign a grade
 * based on the percentage.
 *
 * Grade Criteria:
 * A -> 80% and above
 * B -> 70% - 79%
 * C -> 60% - 69%
 * D -> 50% - 59%
 * E -> 40% - 49%
 * R -> 39% and below
 *
 * The program:
 * 1. Generates random 2-digit marks for Physics, Chemistry and Maths.
 * 2. Calculates total, average and percentage for each student.
 * 3. Calculates the grade based on the percentage.
 * 4. Displays the complete scorecard in tabular format.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class StudentGrade {

    // Method to generate random PCM marks
    public static int[][] generateMarks(int numberOfStudents) {

        int[][] marks = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {

            // Generate 2-digit marks from 10 to 99
            marks[i][0] = 10 + (int)(Math.random() * 90); // Physics
            marks[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            marks[i][2] = 10 + (int)(Math.random() * 90); // Maths
        }

        return marks;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;

            double percentage = (total / 300.0) * 100;

            // Round average and percentage to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrade(double[][] result) {

        String[][] grades = new String[result.length][1];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }

        return grades;
    }

    // Method to display the complete scorecard
    public static void displayScoreCard(int[][] marks,
                                        double[][] result,
                                        String[][] grades) {

        System.out.println("\nStudent Score Card");
        System.out.println(
                "Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade"
        );

        System.out.println(
                "--------------------------------------------------------------------------"
        );

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t\t" +
                    marks[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "%\t\t" +
                    grades[i][0]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Generate PCM marks
        int[][] marks = generateMarks(numberOfStudents);

        // Calculate total, average and percentage
        double[][] result = calculateResults(marks);

        // Calculate grade
        String[][] grades = calculateGrade(result);

        // Display final scorecard
        displayScoreCard(marks, result, grades);

        sc.close();
    }
}