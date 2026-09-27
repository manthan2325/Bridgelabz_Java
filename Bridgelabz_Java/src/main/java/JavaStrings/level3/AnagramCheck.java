/*
 * Problem 31 - GCR Methods Level 1
 *
 * Program to check whether two texts are anagrams.
 *
 * An anagram is a word or phrase formed by rearranging the
 * same letters to form another word or phrase.
 *
 * The program:
 * 1. Takes two texts as input from the user.
 * 2. Checks whether the lengths of both texts are equal.
 * 3. Creates two frequency arrays of size 256 for ASCII characters.
 * 4. Finds the frequency of each character in both texts.
 * 5. Compares the frequencies of all characters.
 * 6. If all frequencies are equal, the texts are anagrams.
 * 7. Displays the result.
 *
 * Hint =>
 * 1. Create a method to check if two texts are anagrams.
 * 2. First check if the lengths of the two texts are equal.
 * 3. Create arrays to store the frequency of characters
 *    in both texts.
 * 4. Find the frequency of each character using loops.
 * 5. Compare the frequency arrays.
 * 6. If any frequency is different, return false.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class AnagramCheck {

    // Method to check whether two texts are anagrams
    public static boolean checkAnagram(String text1, String text2) {

        // If lengths are different, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Arrays to store frequency of 256 ASCII characters
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Find frequency of characters in first text
        for (int i = 0; i < text1.length(); i++) {
            char ch = text1.charAt(i);
            frequency1[ch]++;
        }

        // Find frequency of characters in second text
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            frequency2[ch]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {

            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Call the method
        boolean result = checkAnagram(text1, text2);

        // Display result
        if (result) {
            System.out.println("The two texts are Anagrams.");
        } else {
            System.out.println("The two texts are not Anagrams.");
        }

        sc.close();
    }
}