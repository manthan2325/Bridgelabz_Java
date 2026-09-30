/*
 * Problem 35 - GCR Methods Level 1
 *
 * Program to reverse a given String without using any built-in
 * reverse functions.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Creates a method to reverse the String.
 * 3. Uses charAt() to access each character.
 * 4. Starts from the last character and moves towards the first
 *    character.
 * 5. Adds each character to the reversed String.
 * 6. Displays the original and reversed String.
 *
 * Hint =>
 * 1. Create a method to reverse the String.
 * 2. Use charAt() to access each character.
 * 3. Start the loop from the last index of the String.
 * 4. Move backwards until the first character.
 * 5. Do not use any built-in reverse function.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class ReverseString {

    // Method to reverse the String
    public static String reverseString(String text) {

        String reverse = "";

        // Start from the last character and move backwards
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method
        String result = reverseString(text);

        // Display the result
        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + result);

        sc.close();
    }
}