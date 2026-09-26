/*
 * Problem 16 - GCR Methods Level 1
 * Program to split the text into words and return the words
 * along with their lengths in a 2D array.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Splitwords_Q3 {

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

    // Method to create 2D array containing word and its length
    public static String[][] getWordsAndLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];

            int length = findLength(words[i]);

            // Convert length into String
            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text as input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = splitWords(text);

        // Get words and their lengths
        String[][] result = getWordsAndLength(words);

        // Display the result
        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < result.length; i++) {

            // Convert String length back to Integer
            int length = Integer.parseInt(result[i][1]);

            System.out.println(result[i][0] + "\t" + length);
        }

        sc.close();
    }
}