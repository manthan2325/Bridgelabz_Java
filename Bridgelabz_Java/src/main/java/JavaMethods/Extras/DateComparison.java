/*
 * Problem 4 - Date Comparison
 *
 * Program to compare two dates and check whether the first date
 * is before, after, or the same as the second date.
 *
 * The program:
 * 1. Takes two dates as input from the user.
 * 2. Converts the input dates into LocalDate objects.
 * 3. Uses isBefore() to check if the first date is before the second.
 * 4. Uses isAfter() to check if the first date is after the second.
 * 5. Uses isEqual() to check if both dates are the same.
 * 6. Displays the comparison result.
 *
 * Hint =>
 * 1. Use LocalDate to store the dates.
 * 2. Use isBefore() to check if a date is before another date.
 * 3. Use isAfter() to check if a date is after another date.
 * 4. Use isEqual() to check if two dates are equal.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take the first date as input
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String input1 = sc.nextLine();

        // Take the second date as input
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String input2 = sc.nextLine();

        // Convert the input Strings into LocalDate
        LocalDate date1 = LocalDate.parse(input1);
        LocalDate date2 = LocalDate.parse(input2);

        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same.");
        }

        sc.close();
    }
}