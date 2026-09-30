/*
 * Problem 41 - GCR Methods Level 1
 *
 * Program to compare two Strings lexicographically without using
 * any built-in compare methods.
 *
 * Lexicographical comparison means comparing two Strings in the
 * same way as words are arranged in a dictionary.
 *
 * The program:
 * 1. Takes two Strings as input from the user.
 * 2. Compares the characters of both Strings using charAt().
 * 3. If two characters are different, their character values are
 *    compared to determine which String comes first.
 * 4. If all common characters are equal, the lengths of the Strings
 *    are compared.
 * 5. Displays whether the first String is smaller, equal to, or
 *    greater than the second String.
 *
 * Hint =>
 * 1. Create a method to compare two Strings lexicographically.
 * 2. Use charAt() to compare characters at the same position.
 * 3. If the characters are different, return the difference between
 *    their character values.
 * 4. If all compared characters are equal, compare the lengths.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class LexicographicalComparison {

    // Method to compare two Strings lexicographically
    public static int compareStrings(String text1, String text2) {

        int minLength;

        // Find the length of the smaller String
        if (text1.length() < text2.length()) {
            minLength = text1.length();
        } else {
            minLength = text2.length();
        }

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {

            char ch1 = text1.charAt(i);
            char ch2 = text2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }

        // If common characters are same, compare lengths
        return text1.length() - text2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String text2 = sc.nextLine();

        // Call the method
        int result = compareStrings(text1, text2);

        // Display the result
        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println("First string comes before the second string.");
        } else {
            System.out.println("First string comes after the second string.");
        }

        sc.close();
    }
}