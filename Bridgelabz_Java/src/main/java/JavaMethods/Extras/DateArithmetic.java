/*
 * Problem 2 - Date Arithmetic
 *
 * Program to perform date arithmetic using LocalDate.
 *
 * The program:
 * 1. Takes a date as input from the user.
 * 2. Adds 7 days to the date.
 * 3. Adds 1 month to the result.
 * 4. Adds 2 years to the result.
 * 5. Subtracts 3 weeks from the final result.
 * 6. Displays the final date.
 *
 * Hint =>
 * 1. Use LocalDate to store the date.
 * 2. Use plusDays() to add 7 days.
 * 3. Use plusMonths() to add 1 month.
 * 4. Use plusYears() to add 2 years.
 * 5. Use minusWeeks() to subtract 3 weeks.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = sc.nextLine();

        // Convert input String into LocalDate
        LocalDate date = LocalDate.parse(input);

        // Add 7 days
        date = date.plusDays(7);

        // Add 1 month
        date = date.plusMonths(1);

        // Add 2 years
        date = date.plusYears(2);

        // Subtract 3 weeks
        date = date.minusWeeks(3);

        // Display the final date
        System.out.println("Final date: " + date);

        sc.close();
    }
}