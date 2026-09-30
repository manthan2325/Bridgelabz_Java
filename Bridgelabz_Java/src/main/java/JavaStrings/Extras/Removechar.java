/*
 * Problem 43 - GCR Methods Level 1
 *
 * Program to remove all occurrences of a specific character
 * from a given String.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Takes the character that needs to be removed.
 * 3. Checks each character of the String using charAt().
 * 4. Adds the character to the result only if it is not the
 *    character to be removed.
 * 5. Displays the modified String.
 *
 * Hint =>
 * 1. Create a method to remove a specific character from a String.
 * 2. Use charAt() to access each character.
 * 3. Compare each character with the character to be removed.
 * 4. Skip the character if it matches.
 * 5. Add all other characters to the result.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Removechar {

    // Method to remove all occurrences of a character
    public static String removeCharacter(String text, char removeChar) {

        String result = "";

        // Check each character in the String
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Add character only if it is not the character to remove
            if (ch != removeChar) {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char removeChar = sc.next().charAt(0);

        // Call the method
        String result = removeCharacter(text, removeChar);

        // Display the result
        System.out.println("Modified String: " + result);

        sc.close();
    }
}