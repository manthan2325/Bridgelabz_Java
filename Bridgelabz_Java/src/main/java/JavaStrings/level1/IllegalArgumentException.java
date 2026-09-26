/*
 * Problem 9 - GCR Methods Level 1
 * Program to demonstrate IllegalArgumentException.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class IllegalArgumentException {

    // Method to generate the exception
    public static void generateException(String text) {

        // Start index is greater than end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle the exception
    public static void handleException(String text) {

        try {
            // Start index is greater than end index
            System.out.println(text.substring(5, 2));
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take String input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First call the method that generates the exception
        // generateException(text);

        // Then call the method that handles the exception
        handleException(text);

        sc.close();
    }
}