/*
 * Problem 1 - GCR Arrays Level 2
 * Create a program to save odd and even numbers into odd and even arrays
 * between 1 to the number entered by the user.
 * Finally, print the odd and even numbers arrays.
 * Hint =>
 * Get an integer input from the user and assign it to the variable number.
 * Check if the number is a natural number.
 * If the number is not a natural number, print an error message and exit
 * the program.
 * Create integer arrays for even and odd numbers with size = number / 2 + 1.
 * Create index variables for odd and even numbers and initialize them to zero.
 * Use a for loop to iterate from 1 to the number.
 * In each iteration, check if the number is odd or even.
 * If the number is odd, store it in the odd array and increment the odd index.
 * If the number is even, store it in the even array and increment the even index.
 * Finally, print the odd and even numbers arrays using their respective indexes.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class OddEvenArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number.");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("Odd numbers:");

        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println();

        System.out.println("Even numbers:");

        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}