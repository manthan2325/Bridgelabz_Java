/*
 * Problem 1 - GCR Arrays Level 2
 * Create a program to find the multiplication table of a number entered by
 * the user from 6 to 9 and display the result.
 * Hint =>
 * Take integer input and store it in the number variable.
 * Define an integer array to store the multiplication results in the
 * multiplicationResult variable.
 * Use a for loop to find the multiplication table from 6 to 9.
 * Store each multiplication result in the array.
 * Finally, display the result from the array in the format number * i = ___.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] multiplicationResult = new int[4];

        for(int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        for(int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
}