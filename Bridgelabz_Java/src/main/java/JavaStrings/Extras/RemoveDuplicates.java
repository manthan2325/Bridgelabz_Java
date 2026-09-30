/*
 * Problem 37 - GCR Methods Level 1
 *
 * Program to remove all duplicate characters from a given String
 * and return the modified String.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Checks each character of the String.
 * 3. Uses nested loops to check whether a character has already
 *    appeared in the String.
 * 4. Adds only the first occurrence of each character to the result.
 * 5. Returns and displays the String without duplicate characters.
 *
 * Hint =>
 * 1. Create a method to remove duplicate characters.
 * 2. Use charAt() to access each character.
 * 3. Use nested loops to check whether the character already exists.
 * 4. Add the character to the result only if it has not appeared before.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class RemoveDuplicates {

    // Method to remove duplicate characters
    public static String removeDuplicates(String text) {

        String result = "";

        // Check each character
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            boolean duplicate = false;

            // Check if the character already exists in result
            for (int j = 0; j < result.length(); j++) {

                if (ch == result.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            // Add character if it is not already present
            if (!duplicate) {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method
        String result = removeDuplicates(text);

        // Display the result
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}