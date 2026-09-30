/*
 * Problem 44 - GCR Methods Level 1
 *
 * Program to check whether two Strings are anagrams of each other.
 *
 * An anagram is a word or String formed by rearranging the
 * characters of another String. Both Strings must contain the
 * same characters with the same frequency.
 *
 * The program:
 * 1. Takes two Strings as input from the user.
 * 2. Checks whether both Strings have the same length.
 * 3. Creates frequency arrays for both Strings.
 * 4. Counts the frequency of each character.
 * 5. Compares the frequency of all characters.
 * 6. Displays whether the Strings are anagrams.
 *
 * Hint =>
 * 1. Create a method to check whether two Strings are anagrams.
 * 2. First check whether their lengths are equal.
 * 3. Create arrays to store the frequency of characters.
 * 4. Use charAt() to find the frequency of each character.
 * 5. Compare the frequency arrays.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class AnagramCheck {

    // Method to check whether two Strings are anagrams
    public static boolean checkAnagram(String text1, String text2) {

        // If lengths are different, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Arrays to store frequency of ASCII characters
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Find frequency of characters in first String
        for (int i = 0; i < text1.length(); i++) {
            char ch = text1.charAt(i);
            frequency1[ch]++;
        }

        // Find frequency of characters in second String
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            frequency2[ch]++;
        }

        // Compare the frequency of each character
        for (int i = 0; i < 256; i++) {

            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String text2 = sc.nextLine();

        // Call the method
        boolean result = checkAnagram(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The two strings are Anagrams.");
        } else {
            System.out.println("The two strings are not Anagrams.");
        }

        sc.close();
    }
}