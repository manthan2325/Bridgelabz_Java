/*
 * Problem 28 - GCR Methods Level 1
 *
 * Program to find the frequency of each unique character in a String.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Finds all the unique characters in the String using charAt()
 *    and nested loops.
 * 3. Creates an integer array of size 256 to store the frequency
 *    of each ASCII character.
 * 4. Finds the frequency of every character in the String.
 * 5. Creates a 2D String array to store the unique characters
 *    and their frequencies.
 * 6. Displays each unique character along with its frequency.
 *
 * Hint =>
 * 1. Create a method to find unique characters using charAt()
 *    and nested loops and return them as a 1D array.
 * 2. Create a method to find the frequency of characters.
 * 3. Use an integer array of size 256 for ASCII character frequencies.
 * 4. Call the uniqueCharacters() method to get the unique characters.
 * 5. Create a 2D String array to store the characters and frequencies.
 * 6. Loop through the unique characters and store their frequencies.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Characterfreq {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {

        int uniqueCount = 0;

        // Count the number of unique characters
        for (int i = 0; i < text.length(); i++) {

            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueCount++;
            }
        }

        // Create an array to store unique characters
        char[] unique = new char[uniqueCount];

        int index = 0;

        // Store unique characters
        for (int i = 0; i < text.length(); i++) {

            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[index] = text.charAt(i);
                index++;
            }
        }

        return unique;
    }

    // Method to find frequency of unique characters
    public static String[][] findFrequency(String text) {

        // Array to store frequency of 256 ASCII characters
        int[] frequency = new int[256];

        // Find frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Get unique characters
        char[] unique = uniqueCharacters(text);

        // Create 2D array for character and frequency
        String[][] result = new String[unique.length][2];

        // Store unique characters and their frequencies
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method to find frequency
        String[][] result = findFrequency(text);

        // Display the result
        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close();
    }
}