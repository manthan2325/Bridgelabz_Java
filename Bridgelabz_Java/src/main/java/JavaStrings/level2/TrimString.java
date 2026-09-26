/*
 * Problem 20 - GCR Methods Level 1
 *
 * Program to trim the leading and trailing spaces from a String
 * using the charAt() method without using the built-in trim() method.
 *
 * The program:
 * 1. Finds the starting and ending positions after removing the
 *    leading and trailing spaces.
 * 2. Creates the trimmed String using charAt().
 * 3. Compares the user-defined trimmed String with the String
 *    obtained using the built-in trim() method.
 * 4. Displays both results and checks whether they are equal.
 *
 * Hint =>
 * 1. Create a method to find the start and end points of the String
 *    after removing leading and trailing spaces using charAt().
 * 2. Create a method to create a substring using charAt().
 * 3. Create a method to compare two Strings using charAt().
 * 4. Use the built-in trim() method and compare both results.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class TrimString {

    // Method to find the start and end indexes after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Find the first character which is not a space
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last character which is not a space
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two Strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text as input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find start and end indexes
        int[] indexes = findTrimIndexes(text);

        String userDefinedResult;

        // Handle the case where the String contains only spaces
        if (indexes[0] > indexes[1]) {
            userDefinedResult = "";
        } else {
            userDefinedResult = createSubstring(
                    text, indexes[0], indexes[1]
            );
        }

        // Use the built-in trim() method
        String builtInResult = text.trim();

        // Compare both results
        boolean result = compareStrings(
                userDefinedResult, builtInResult
        );

        System.out.println("\nUsing user-defined method: ["
                + userDefinedResult + "]");

        System.out.println("Using trim(): ["
                + builtInResult + "]");

        if (result) {
            System.out.println("Both results are equal.");
        } else {
            System.out.println("Both results are not equal.");
        }

        sc.close();
    }
}