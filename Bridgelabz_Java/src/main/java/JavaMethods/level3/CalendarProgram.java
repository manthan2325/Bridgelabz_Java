/*
 * Problem 14 - GCR Methods Level 1
 * Create a program to display a calendar for a given month and year.
 *
 * Hint =>
 * 1. Take month and year as input from the user.
 * 2. Write a Method to get the name of the month using a month array.
 * 3. Write a Method to get the number of days in the month using a days array.
 *    For February, check for Leap Year.
 * 4. Write a Method to get the first day of the month using
 *    the Gregorian calendar algorithm.
 * 5. Display the calendar using 2 for loops.
 *    The first loop gives indentation for the first day.
 *    The second loop displays the days of the month using %3d.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class CalendarProgram {

    // Array containing names of months
    static String[] months = {
        "", "January", "February", "March", "April",
        "May", "June", "July", "August", "September",
        "October", "November", "December"
    };

    // Array containing number of days in each month
    static int[] days = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return months[month];
    }

    // Method to check whether the year is a leap year
    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    // Method to get number of days in the month
    public static int getNumberOfDays(int month, int year) {

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month];
    }

    // Method to find the first day of the month
    public static int getFirstDay(int month, int year) {

        int d = 1;

        int y0 = year - (14 - month) / 12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = month + 12 * ((14 - month) / 12) - 2;

        int d0 = (d + x + 31 * m0 / 12) % 7;

        return d0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take month and year as input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
            sc.close();
            return;
        }

        // Get month name
        String monthName = getMonthName(month);

        // Get number of days
        int numberOfDays = getNumberOfDays(month, year);

        // Get first day
        int firstDay = getFirstDay(month, year);

        // Display calendar heading
        System.out.println("\n      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop to display days
        for (int day = 1; day <= numberOfDays; day++) {

            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        sc.close();
    }
}