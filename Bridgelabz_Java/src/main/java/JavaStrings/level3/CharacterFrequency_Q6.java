/*
 * Problem 29 - GCR Methods Level 1
 *
 * Program to find the frequency of each character in a String
 * using nested loops and display the result.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Converts the String into a character array using toCharArray().
 * 3. Uses nested loops to find the frequency of each character.
 * 4. Initializes the frequency of each character to 1.
 * 5. Checks for duplicate characters using the inner loop.
 * 6. Increments the frequency when a duplicate is found.
 * 7. Sets duplicate characters to '0' so they are not counted again.
 * 8. Stores the characters and their frequencies in a 1D String array.
 * 9. Displays the character and its frequency.
 *
 * Hint =>
 * 1. Create a method to find the frequency of characters and return
 *    the characters and frequencies in a 1D array.
 * 2. Convert the String into a character array using toCharArray().
 * 3. Use nested loops to find the frequency of each character.
 * 4. Initialize the frequency of each character to 1.
 * 5. If a duplicate character is found, increment its frequency
 *    and set the duplicate character to '0'.
 * 6. Create a 1D String array to store the characters and frequencies.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class CharacterFrequency_Q6 {

    // Method to find frequency of characters using nested loops
    public static String[] findFrequency(String text) {

        // Convert String into character array
        char[] characters = text.toCharArray();

        // Array to store frequency of each character
        int[] frequency = new int[characters.length];

        // Outer loop goes through each character
        for (int i = 0; i < characters.length; i++) {

            // Skip duplicate characters
            if (characters[i] == '0') {
                continue;
            }

            // Start frequency from 1
            frequency[i] = 1;

            // Inner loop checks for duplicate characters
            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j]) {
                    frequency[i]++;

                    // Set duplicate character to '0'
                    characters[j] = '0';
                }
            }
        }

        // Count the number of unique characters
        int uniqueCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // 1D String array to store character and frequency
        String[] result = new String[uniqueCount];

        int index = 0;

        // Store characters and their frequencies
        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != '0') {
                result[index] = characters[i] + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method
        String[] result = findFrequency(text);

        // Display the result
        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}