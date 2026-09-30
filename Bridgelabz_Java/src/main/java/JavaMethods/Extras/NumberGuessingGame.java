/*
 * Problem 5 - Number Guessing Game
 *
 * Program where the user thinks of a number between 1 and 100
 * and the computer tries to guess the number.
 *
 * The program:
 * 1. Asks the user to think of a number between 1 and 100.
 * 2. Generates a random guess within the given range.
 * 3. Takes feedback from the user:
 *    - H if the guess is high
 *    - L if the guess is low
 *    - C if the guess is correct
 * 4. Adjusts the range based on the user's feedback.
 * 5. Continues guessing until the computer finds the number.
 *
 * Hint =>
 * 1. Create a method to generate a random guess.
 * 2. Create a method to receive feedback from the user.
 * 3. Create a method to determine the next guess based on
 *    the previous guess and the user's feedback.
 * 4. Use the minimum and maximum values to keep track of
 *    the possible range.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class NumberGuessingGame {

    // Method to generate a guess between minimum and maximum
    public static int generateGuess(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    // Method to get feedback from the user
    public static char getFeedback(Scanner sc) {

        System.out.print("Enter feedback (H = High, L = Low, C = Correct): ");
        return sc.next().toUpperCase().charAt(0);
    }

    // Method to determine the next range based on feedback
    public static int[] getNextRange(int guess, char feedback,
                                     int min, int max) {

        if (feedback == 'H') {
            // Guess was too high
            max = guess - 1;
        } else if (feedback == 'L') {
            // Guess was too low
            min = guess + 1;
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Do not tell me the number!");

        int min = 1;
        int max = 100;
        int attempts = 0;

        while (min <= max) {

            // Generate a random guess
            int guess = generateGuess(min, max);
            attempts++;

            System.out.println("\nComputer's guess: " + guess);

            // Get feedback from the user
            char feedback = getFeedback(sc);

            if (feedback == 'C') {
                System.out.println("Computer guessed your number!");
                System.out.println("Number of attempts: " + attempts);
                break;
            }

            // Update the possible range
            int[] range = getNextRange(guess, feedback, min, max);

            min = range[0];
            max = range[1];
        }

        sc.close();
    }
}