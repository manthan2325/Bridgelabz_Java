/*
 * Problem 9 - Palindrome Checker
 *
 * Program to check whether a given String is a palindrome.
 *
 * A palindrome is a word, phrase, or sequence that reads the
 * same backward as forward.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Uses a separate method to take the input.
 * 3. Uses a separate method to check whether the String is
 *    a palindrome.
 * 4. Uses a separate method to display the result.
 *
 * Hint =>
 * 1. Create a method to take the String input.
 * 2. Create a method to check the palindrome condition.
 * 3. Compare characters from the beginning and end of the String.
 * 4. Create a method to display whether the String is a palindrome.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class PalindromeChecker {

    // Method to take input
    public static String takeInput(Scanner sc) {

        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Method to check whether the String is a palindrome
    public static boolean checkPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method to display the result
    public static void displayResult(String text, boolean result) {

        if (result) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is not a Palindrome.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        String text = takeInput(sc);

        // Check palindrome
        boolean result = checkPalindrome(text);

        // Display result
        displayResult(text, result);

        sc.close();
    }
}