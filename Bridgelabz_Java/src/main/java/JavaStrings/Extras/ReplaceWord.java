/*
 * Problem 45 - GCR Methods Level 1
 *
 * Program to replace a given word with another word in a sentence.
 *
 * The program:
 * 1. Takes a sentence as input from the user.
 * 2. Takes the word that needs to be replaced.
 * 3. Takes the new word that should replace it.
 * 4. Searches the sentence for the given word.
 * 5. Replaces the word with the new word.
 * 6. Displays the modified sentence.
 *
 * Hint =>
 * 1. Create a method to replace a given word with another word.
 * 2. Find the word in the sentence.
 * 3. Create the new sentence by replacing the old word.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class ReplaceWord {

    // Method to replace a word with another word
    public static String replaceWord(String sentence, String oldWord,
                                     String newWord) {

        String result = "";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(oldWord)) {
                result = result + newWord;
            } else {
                result = result + words[i];
            }

            // Add space between words
            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        // Call the method
        String result = replaceWord(sentence, oldWord, newWord);

        // Display the result
        System.out.println("Modified Sentence: " + result);

        sc.close();
    }
}