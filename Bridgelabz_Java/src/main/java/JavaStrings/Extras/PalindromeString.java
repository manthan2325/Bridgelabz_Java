/*
 * Problem 36 - GCR Methods Level 1
 *
 * Program to check whether a given String is a palindrome.
 *
 * A palindrome is a String that reads the same forward and backward.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Compares characters from the beginning and end of the String.
 * 3. Moves towards the middle while comparing the characters.
 * 4. If any characters are different, the String is not a palindrome.
 * 5. If all characters are the same, the String is a palindrome.
 *
 * Hint =>
 * 1. Create a method to check whether the String is a palindrome.
 * 2. Use charAt() to access the characters.
 * 3. Compare the first character with the last character,
 *    second character with the second-last character, and so on.
 * 4. Return false if any pair of characters is different.
 * 5. Otherwise, return true.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class PalindromeString {

    // Method to check whether the String is a palindrome
    public static boolean isPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Compare characters from both ends
        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method
        boolean result = isPalindrome(text);

        // Display the result
        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }

        sc.close();
    }
}