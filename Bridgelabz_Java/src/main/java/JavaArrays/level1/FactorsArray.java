/*
 * Problem 1 - GCR Arrays Level 2
 * Create a program to find the factors of a number taken as user input,
 * store the factors in an array, and display the factors.
 * Hint =>
 * Take the input for a number.
 * Create an integer variable maxFactor and initialize it to 10.
 * Create a factors array of size maxFactor and an index variable to track
 * the current index of the array.
 * Use a loop from 1 to the number to find the factors of the number.
 * If the number is divisible by the current value, store the value in the
 * factors array and increment the index.
 * If the index reaches the maximum size of the array, increase the array
 * size to twice its current size.
 * Create a temporary array with the new size and copy all the elements
 * from the factors array into the temporary array.
 * Finally, assign the temporary array to the factors array.
 * Display all the factors stored in the array.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class FactorsArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                if (index == maxFactor) {

                    maxFactor = maxFactor * 2;

                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[index] = i;
                index++;
            }
        }

        System.out.println("Factors of " + number + ":");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}