/*
 * Problem 38 - GCR Methods Level 1
 *
 * Program to find the longest word in a given sentence.
 *
 * The program:
 * 1. Takes a sentence as input from the user.
 * 2. Splits the sentence into individual words.
 * 3. Compares the length of each word.
 * 4. Keeps track of the word with the greatest length.
 * 5. Displays the longest word in the sentence.
 *
 * Hint =>
 * 1. Create a method to find the longest word in a sentence.
 * 2. Split the sentence into words using spaces.
 * 3. Compare the length of each word.
 * 4. Store the word with the maximum length.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class LongestWord {

    // Method to find the longest word
    public static String findLongestWord(String sentence) {

        String[] words = sentence.split(" ");

        String longestWord = words[0];

        // Compare each word with the longest word
        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Call the method
        String result = findLongestWord(sentence);

        // Display the result
        System.out.println("Longest word: " + result);

        sc.close();
    }
}