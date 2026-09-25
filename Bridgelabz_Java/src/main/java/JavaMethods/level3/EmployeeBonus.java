/*
 * Problem 1 - GCR Methods Level 1
 * Create a program to find the bonus of 10 employees based on their
 * years of service as well as the total bonus amount the 10-year-old
 * company Zara has to pay as a bonus, along with the old and new salary.
 *
 * Hint =>
 * 1. Zara decides to give a bonus of 5% to employees whose year of
 *    service is more than 5 years or 2% if less than 5 years.
 * 2. Create a Method to determine the Salary and years of service
 *    and return the same. Use Math.random() method to determine the
 *    5-digit salary for each employee and also use random method to
 *    determine the years of service. Define 2D Array to save the
 *    salary and years of service.
 * 3. Write a Method to calculate the new salary and bonus based on
 *    the logic defined above and return the new 2D Array of the
 *    latest salary and bonus amount.
 * 4. Write a Method to Calculate the sum of the Old Salary, the Sum
 *    of the New Salary, and the Total Bonus Amount and display it
 *    in a Tabular Format.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class EmployeeBonus {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int numberOfEmployees) {

        int[][] employeeData = new int[numberOfEmployees][2];

        for (int i = 0; i < numberOfEmployees; i++) {

            // Generate 5-digit salary from 10000 to 99999
            employeeData[i][0] = 10000 + (int)(Math.random() * 90000);

            // Generate years of service from 1 to 10
            employeeData[i][1] = 1 + (int)(Math.random() * 10);
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employeeData) {

        double[][] result = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {

            double oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonus;

            // More than 5 years -> 5% bonus
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } 
            // Less than or equal to 5 years -> 2% bonus
            else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;

            // Store new salary and bonus
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    // Method to calculate and display totals
    public static void displayReport(int[][] employeeData,
                                     double[][] result) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;


        for (int i = 0; i < employeeData.length; i++) {

            double oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double newSalary = result[i][0];
            double bonus = result[i][1];

            System.out.printf("%d\t\t%.2f\t%d\t%.2f\t\t%.2f%n",
                    i + 1,
                    oldSalary,
                    yearsOfService,
                    bonus,
                    newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }


        System.out.printf("Total Old Salary  : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus       : %.2f%n", totalBonus);
        System.out.printf("Total New Salary  : %.2f%n", totalNewSalary);
    }

    public static void main(String[] args) {

        int numberOfEmployees = 10;

        // Generate salary and years of service
        int[][] employeeData =
                generateEmployeeData(numberOfEmployees);

        // Calculate bonus and new salary
        double[][] result =
                calculateBonus(employeeData);

        // Display complete report
        displayReport(employeeData, result);
    }
}