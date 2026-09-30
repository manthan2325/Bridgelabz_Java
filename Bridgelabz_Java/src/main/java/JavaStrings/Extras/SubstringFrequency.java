/*
 * Problem 39 - GCR Methods Level 1
 *
 * Program to count how many times a given substring occurs
 * in a String.
 *
 * The program:
 * 1. Takes a String and a substring as input from the user.
 * 2. Checks each possible position in the String.
 * 3. Compares the characters of the substring with the characters
 *    in the String.
 * 4. Increases the count whenever the substring is found.
 * 5. Displays the total number of occurrences.
 *
 * Hint =>
 * 1. Create a method to count the occurrences of a substring.
 * 2. Use charAt() to compare the characters.
 * 3. Start checking from index 0 and continue until the substring
 *    can fit inside the String.
 * 4. Increase the count whenever all characters of the substring
 *    match.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class SubstringFrequency {

    // Method to count occurrences of a substring
    public static int countSubstring(String text, String substring) {

        int count = 0;

        // Check every possible starting position
        for (int i = 0; i <= text.length() - substring.length(); i++) {

            boolean found = true;

            // Compare characters of substring
            for (int j = 0; j < substring.length(); j++) {

                if (text.charAt(i + j) != substring.charAt(j)) {
                    found = false;
                    break;
                }
            }

            // If substring is found, increase count
            if (found) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring: ");
        String substring = sc.nextLine();

        // Call the method
        int result = countSubstring(text, substring);

        // Display the result
        System.out.println("Number of occurrences: " + result);

        sc.close();
    }
}