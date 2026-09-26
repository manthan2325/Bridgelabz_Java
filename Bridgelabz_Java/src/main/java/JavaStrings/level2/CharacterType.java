/*
 * Problem 19 - GCR Methods Level 1
 *
 * Program to find whether each character in a given String is a
 * Vowel, Consonant, or Not a Letter.
 *
 * The program:
 * 1. Takes a complete String as input from the user.
 * 2. Checks each character using the charAt() method.
 * 3. Converts uppercase letters to lowercase using ASCII values.
 * 4. Identifies each character as Vowel, Consonant, or Not a Letter.
 * 5. Stores the character and its type in a 2D String array.
 * 6. Displays the character and its type in a tabular format.
 *
 * Hint =>
 * 1. Create a method to check whether a character is a vowel,
 *    consonant, or not a letter.
 * 2. Convert uppercase characters to lowercase using ASCII values.
 * 3. Create a method to check all characters using charAt() and
 *    return the character and its type in a 2D String array.
 * 4. Create a method to display the 2D String array in tabular format.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class CharacterType {

    // Method to check whether a character is Vowel, Consonant or Not a Letter
    public static String checkCharacter(char ch) {

        // Convert uppercase letter to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check if the character is a consonant
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        // Character is not a letter
        return "Not a Letter";
    }

    // Method to find the type of each character in the String
    public static String[][] findCharacterTypes(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] result) {

        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text as input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find the type of each character
        String[][] result = findCharacterTypes(text);

        // Display the result
        displayTable(result);

        sc.close();
    }
}