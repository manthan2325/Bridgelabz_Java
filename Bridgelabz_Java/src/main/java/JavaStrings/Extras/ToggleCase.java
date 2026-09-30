/*
 * Problem 40 - GCR Methods Level 1
 *
 * Program to toggle the case of each character in a given String.
 * Uppercase letters are converted to lowercase and lowercase
 * letters are converted to uppercase.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Checks each character using charAt().
 * 3. Converts uppercase letters to lowercase.
 * 4. Converts lowercase letters to uppercase.
 * 5. Keeps spaces, numbers and special characters unchanged.
 * 6. Displays the toggled String.
 *
 * Hint =>
 * 1. Create a method to toggle the case of a String.
 * 2. Use charAt() to access each character.
 * 3. If the character is between 'A' and 'Z', add 32 to
 *    convert it to lowercase.
 * 4. If the character is between 'a' and 'z', subtract 32
 *    to convert it to uppercase.
 * 5. Add the converted character to the result.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class ToggleCase {

    // Method to toggle the case of each character
    public static String toggleCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            // Convert lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            // Add character to result
            result = result + ch;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method
        String result = toggleCase(text);

        // Display the result
        System.out.println("Toggled String: " + result);

        sc.close();
    }
}