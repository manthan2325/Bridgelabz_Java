/*
 * Problem 34 - GCR Methods Level 1
 *
 * Program to count the number of vowels and consonants in a given String.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Checks each character of the String.
 * 3. Checks whether the character is a vowel or a consonant.
 * 4. Ignores spaces, numbers and special characters.
 * 5. Counts and displays the total number of vowels and consonants.
 *
 * Hint =>
 * 1. Create a method to count vowels and consonants.
 * 2. Use charAt() to access each character of the String.
 * 3. Check for vowels: a, e, i, o, u.
 * 4. Check whether the character is an alphabet before counting
 *    it as a consonant.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class VowelsAndConsonants {

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Convert uppercase character to lowercase
            ch = Character.toLowerCase(ch);

            // Check for alphabet
            if (ch >= 'a' && ch <= 'z') {

                // Check for vowel
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] result = countVowelsAndConsonants(text);

        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);

        sc.close();
    }
}