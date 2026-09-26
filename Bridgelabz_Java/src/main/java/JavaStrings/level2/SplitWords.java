/*
 * Problem 15 - GCR Methods Level 1
 * Program to split text into words using charAt() and compare
 * the result with the built-in split() method.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class SplitWords {

    // Method to find length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
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

        // Array to store the positions of spaces
        int[] spaceIndexes = new int[wordCount - 1];

        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }

        // Array to store the words
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

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {

            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text as input
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Split using user-defined method
        String[] userDefinedWords = splitWords(text);

        // Split using built-in split() method
        String[] builtInWords = text.split(" ");

        // Compare both arrays
        boolean result = compareArrays(
                userDefinedWords,
                builtInWords
        );

        System.out.println("\nWords using user-defined method:");

        for (int i = 0; i < userDefinedWords.length; i++) {
            System.out.println(userDefinedWords[i]);
        }

        System.out.println("\nWords using split():");

        for (int i = 0; i < builtInWords.length; i++) {
            System.out.println(builtInWords[i]);
        }

        if (result) {
            System.out.println("\nBoth results are equal.");
        } else {
            System.out.println("\nBoth results are not equal.");
        }

        sc.close();
    }
}