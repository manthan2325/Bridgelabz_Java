/*
 * Problem 2 - GCR Methods Level 1
 * Write a program that takes a year as input and outputs
 * whether the Year is a Leap Year or not.
 *
 * Hint =>
 * 1. The LeapYear program only works for year >= 1582,
 *    corresponding to a year in the Gregorian calendar.
 * 2. Leap year is divisible by 4 and not divisible by 100
 *    or divisible by 400.
 * 3. Write a method to check for Leap Year using the conditions.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class LeapYear {

    // Method to check whether the year is a leap year
    public static boolean checkLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) ||
            (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take year as input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check whether year is valid for Gregorian calendar
        if (year < 1582) {
            System.out.println("Please enter a year greater than or equal to 1582.");
        } else {

            // Check for leap year
            boolean result = checkLeapYear(year);

            if (result) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        sc.close();
    }
}