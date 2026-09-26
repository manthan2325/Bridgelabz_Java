/*
 * Problem 17 - GCR Methods Level 1
 *
 * Program to split the given text into individual words using the
 * charAt() method without using the built-in split() method.
 *
 * The program also:
 * 1. Finds the length of each word without using the length() method.
 * 2. Stores each word and its length in a 2D String array.
 * 3. Finds the shortest and longest word from the 2D array.
 * 4. Returns the indexes of the shortest and longest words.
 * 5. Displays the shortest and longest words along with their lengths.
 *
 * Hint =>
 * 1. Take user input using Scanner nextLine().
 * 2. Create a method to split the text into words using charAt().
 * 3. Create a method to find the length of a String without using length().
 * 4. Create a 2D String array containing each word and its length.
 * 5. Create a method to find the shortest and longest words and
 *    return their indexes in a 1D integer array.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Splitwords_Q4 {

    // Method to find String length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of String reached
        }

        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitWords(String text) {

        int length = findLength(text);

        // Count the number of words
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store the positions of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }

        // Store the words
        String[] words = new String[wordCount];

        int start = 0;

        for (int i = 0; i < wordCount; i++) {

            int end;

            if (i < spaceIndexes.length) {
                end = spaceIndexes[i];
            } else {
                end = length;
            }

            String word = "";

            for (int j = start; j < end; j++) {
                word = word + text.charAt(j);
            }

            words[i] = word;

            start = end + 1;
        }

        return words;
    }

    // Method to create 2D array containing words and their lengths
    public static String[][] getWordsAndLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];

            int length = findLength(words[i]);

            // Convert length to String
            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    // Method to find shortest and longest word
    public static int[] findShortestAndLongest(String[][] wordsAndLength) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < wordsAndLength.length; i++) {

            int currentLength =
                    Integer.parseInt(wordsAndLength[i][1]);

            int shortestLength =
                    Integer.parseInt(wordsAndLength[shortest][1]);

            int longestLength =
                    Integer.parseInt(wordsAndLength[longest][1]);

            if (currentLength < shortestLength) {
                shortest = i;
            }

            if (currentLength > longestLength) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text as input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = splitWords(text);

        // Get words and their lengths
        String[][] wordsAndLength = getWordsAndLength(words);

        // Find shortest and longest word
        int[] result = findShortestAndLongest(wordsAndLength);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        System.out.println("\nShortest word: "
                + wordsAndLength[shortestIndex][0]);

        System.out.println("Length: "
                + wordsAndLength[shortestIndex][1]);

        System.out.println("\nLongest word: "
                + wordsAndLength[longestIndex][0]);

        System.out.println("Length: "
                + wordsAndLength[longestIndex][1]);

        sc.close();
    }
}