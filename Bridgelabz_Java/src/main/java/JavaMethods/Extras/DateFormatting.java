/*
 * Problem 3 - Date Formatting
 *
 * Program to display the current date in three different formats.
 *
 * The program:
 * 1. Gets the current date using LocalDate.
 * 2. Creates three DateTimeFormatter objects with different patterns.
 * 3. Formats the current date using each formatter.
 * 4. Displays the date in all three formats.
 *
 * Date formats:
 * 1. dd/MM/yyyy
 * 2. yyyy-MM-dd
 * 3. EEE, MMM dd, yyyy
 *
 * Hint =>
 * 1. Use LocalDate to get the current date.
 * 2. Use DateTimeFormatter with custom patterns.
 * 3. Use the format() method to format the date.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {

    public static void main(String[] args) {

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Create formatters for the three formats
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format2 =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter format3 =
                DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display the date in different formats
        System.out.println("Format 1: " + currentDate.format(format1));
        System.out.println("Format 2: " + currentDate.format(format2));
        System.out.println("Format 3: " + currentDate.format(format3));
    }
}