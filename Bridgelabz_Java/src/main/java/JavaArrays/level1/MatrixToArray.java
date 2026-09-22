/*
 * Problem 1 - GCR 2D Arrays Level 1
 * Working with Multi-Dimensional Arrays.
 * Create a Java program to create a 2D Array and copy the 2D Array
 * into a single dimension array.
 * Hint =>
 * Take user input for the number of rows and columns.
 * Create a 2D array (Matrix) using the given rows and columns.
 * Take user input for each element of the 2D array.
 * Create a 1D array of size rows * columns to store all the elements
 * of the 2D array.
 * Define an index variable and initialize it to zero.
 * Use a nested for loop to traverse through the 2D array.
 * Use the outer for loop to access each row.
 * Use the inner for loop to access each element in the row.
 * Copy every element of the 2D array into the 1D array and increment
 * the index after storing each element.
 * Finally, display the elements of the 1D array.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class MatrixToArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * columns];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("1D Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}