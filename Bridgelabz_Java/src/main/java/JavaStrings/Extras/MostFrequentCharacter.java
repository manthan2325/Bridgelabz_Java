/*
 * Problem 42 - GCR Methods Level 1
 *
 * Program to find the most frequent character in a String
 * using a hash method.
 *
 * The program:
 * 1. Takes a String as input from the user.
 * 2. Creates a HashMap to store each character and its frequency.
 * 3. Loops through the String and updates the frequency of
 *    each character.
 * 4. Finds the character having the highest frequency.
 * 5. Displays the most frequent character and its frequency.
 *
 * Hint =>
 * 1. Create a method to find the most frequent character.
 * 2. Use a HashMap to store characters and their frequencies.
 * 3. Loop through the String using charAt().
 * 4. Update the frequency of each character in the HashMap.
 * 5. Loop through the HashMap to find the character with
 *    the highest frequency.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class MostFrequentCharacter {

    // Method to find the most frequent character
    public static char findMostFrequent(String text) {

        // HashMap to store character and its frequency
        HashMap<Character, Integer> frequency = new HashMap<>();

        // Find frequency of each character
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (frequency.containsKey(ch)) {
                frequency.put(ch, frequency.get(ch) + 1);
            } else {
                frequency.put(ch, 1);
            }
        }

        char mostFrequent = text.charAt(0);
        int maxFrequency = 0;

        // Find the character with highest frequency
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {

            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        System.out.println("Frequency: " + maxFrequency);

        return mostFrequent;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method
        char result = findMostFrequent(text);

        // Display the result
        System.out.println("Most frequent character: " + result);

        sc.close();
    }
}