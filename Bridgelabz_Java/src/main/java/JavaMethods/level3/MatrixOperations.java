/*
 * Problem 3 - GCR Methods Level 1
 * Program to perform matrix addition, subtraction, multiplication,
 * transpose, determinant and inverse operations.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createMatrix(int rows, int columns) {

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {

        int rows = matrix1.length;
        int columns = matrix2[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to find transpose of a matrix
    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    // Method to find determinant of a 2x2 matrix
    public static int determinant(int[][] matrix) {

        return (matrix[0][0] * matrix[1][1])
             - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find inverse of a 2x2 matrix
    public static double[][] inverse(int[][] matrix) {

        int det = determinant(matrix);

        if (det == 0) {
            return null;
        }

        double[][] result = new double[2][2];

        result[0][0] = matrix[1][1] / (double) det;
        result[0][1] = -matrix[0][1] / (double) det;
        result[1][0] = -matrix[1][0] / (double) det;
        result[1][1] = matrix[0][0] / (double) det;

        return result;
    }

    // Method to display an integer matrix
    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a double matrix
    public static void displayDoubleMatrix(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Create two random matrices
        int[][] matrix1 = createMatrix(rows, columns);
        int[][] matrix2 = createMatrix(rows, columns);

        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        // Addition
        System.out.println("\nAddition:");
        displayMatrix(addMatrices(matrix1, matrix2));

        // Subtraction
        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        // Multiplication
        if (columns == rows) {
            System.out.println("\nMultiplication:");
            displayMatrix(multiplyMatrices(matrix1, matrix2));
        } else {
            System.out.println("\nMultiplication is not possible.");
            System.out.println("For this program, rows and columns must be equal.");
        }

        // Transpose
        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transpose(matrix1));

        /*
         * Determinant and inverse are calculated only for a 2x2 matrix.
         */
        if (rows == 2 && columns == 2) {

            int det = determinant(matrix1);

            System.out.println("\nDeterminant of Matrix 1: " + det);

            double[][] inverseMatrix = inverse(matrix1);

            if (inverseMatrix == null) {
                System.out.println("Inverse does not exist.");
            } else {
                System.out.println("\nInverse of Matrix 1:");
                displayDoubleMatrix(inverseMatrix);
            }
        } else {
            System.out.println("\nDeterminant and inverse are calculated only for 2x2 matrix.");
        }

        sc.close();
    }
}