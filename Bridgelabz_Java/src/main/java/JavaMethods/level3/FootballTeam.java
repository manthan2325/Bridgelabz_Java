/*
 * Problem 7 - GCR Methods Level 1
 * Create a program to find the shortest, tallest, and mean height
 * of players present in a football team.
 *
 * Hint =>
 * 1. The formula to calculate the mean is:
 *    mean = sum of all elements / number of elements
 * 2. Create an int array named heights of size 11 and get 3 digit
 *    random height in cms for each player in the range 150 cms to 250 cms.
 * 3. Write the method to find the sum of all the elements present in the array.
 * 4. Write the method to find the mean height of the players.
 * 5. Write the method to find the shortest height of the players.
 * 6. Write the method to find the tallest height of the players.
 * 7. Finally display the results.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class FootballTeam {

    // Method to find the sum of all heights
    public static int findSum(int[] heights) {

        int sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {

        int sum = findSum(heights);

        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {

        int shortest = heights[0];

        for (int i = 1; i < heights.length; i++) {

            shortest = Math.min(shortest, heights[i]);
        }

        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {

        int tallest = heights[0];

        for (int i = 1; i < heights.length; i++) {

            tallest = Math.max(tallest, heights[i]);
        }

        return tallest;
    }

    public static void main(String[] args) {

        // Create an array of 11 players
        int[] heights = new int[11];

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {

            heights[i] = 150 + (int)(Math.random() * 101);
        }

        // Display player heights
        System.out.println("Heights of football players:");

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        // Find results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("\nFootball Team Statistics");
        System.out.println("Sum of heights = " + sum + " cm");
        System.out.println("Mean height = " + mean + " cm");
        System.out.println("Shortest height = " + shortest + " cm");
        System.out.println("Tallest height = " + tallest + " cm");
    }
}