/*
 * Problem 1 - GCR Arrays Level 2
 * Create a program to find the mean height of players present in a football team.
 * Hint =>
 * The formula to calculate the mean is:
 * mean = sum of all elements / number of elements.
 * Create a double array named heights of size 11.
 * Get the height values of all 11 players from the user.
 * Find the sum of all the elements present in the heights array.
 * Divide the sum by 11 to find the mean height.
 * Finally, print the mean height of the football team.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class FootballHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        double mean = sum / 11;

        System.out.println("Mean height of the football team = " + mean);

        sc.close();
    }
}