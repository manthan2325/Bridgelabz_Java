/*
 * Problem 32 - GCR Methods Level 1
 *
 * Program to display a calendar for a given month and year.
 *
 * The program:
 * 1. Takes the month and year as input from the user.
 * 2. Finds the name of the month using a month array.
 * 3. Finds the number of days in the month using a days array.
 * 4. Checks whether the given year is a leap year for February.
 * 5. Finds the first day of the month using the Gregorian
 *    calendar algorithm.
 * 6. Displays the calendar with proper spacing for the days.
 *
 * Hint =>
 * 1. Create a method to get the name of the month using an array.
 * 2. Create a method to get the number of days in the month.
 * 3. Create a method to check whether the year is a leap year.
 * 4. Create a method to find the first day of the month using:
 *
 *    y0 = y - (14 - m) / 12
 *    x  = y0 + y0 / 4 - y0 / 100 + y0 / 400
 *    m0 = m + 12 * ((14 - m) / 12) - 2
 *    d0 = (d + x + 31 * m0 / 12) % 7
 *
 * 5. Use two for loops to display the calendar.
 * 6. Use %3d to properly align the days.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Calendar {

    // Method to get the name of the month
    public static String getMonthName(int month) {

        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Method to check whether the year is a leap year
    public static boolean isLeapYear(int year) {

        if ((year % 400 == 0) ||
            (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }

        return false;
    }

    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // February has 29 days in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Method to find the first day of the month
    public static int getFirstDay(int month, int year) {

        int day = 1;

        int y0 = year - (14 - month) / 12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = month + 12 * ((14 - month) / 12) - 2;

        int d0 = (day + x + 31 * m0 / 12) % 7;

        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {

        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDay(month, year);

        // Display month and year
        System.out.println("\n      " + monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // First loop for indentation
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop to display days
        for (int day = 1; day <= numberOfDays; day++) {

            System.out.printf("%3d", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}