/*
 * Problem 2 - GCR Methods Level 1
 * Create a program to find the youngest friend among 3 friends
 * Amar, Akbar and Anthony based on their ages and the tallest
 * among the friends based on their heights and display it.
 *
 * Hint =>
 * 1. Take user input for age and height for the 3 friends and
 *    store it in two arrays each to store the values for age
 *    and height of the 3 friends.
 * 2. Write a Method to find the youngest of the 3 friends.
 * 3. Write a Method to find the tallest of the 3 friends.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Three_Friends {

    // Method to find the youngest friend
    public static int findYoungest(int[] ages) {

        int youngest = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
        }

        return youngest;
    }

    // Method to find the tallest friend
    public static int findTallest(int[] heights) {

        int tallest = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store names of the friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Create arrays for ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take input for age and height
        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Find youngest and tallest
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("\nYoungest friend: " + names[youngest]);
        System.out.println("Tallest friend: " + names[tallest]);

        sc.close();
    }
}