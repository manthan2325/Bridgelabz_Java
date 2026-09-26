/*
 * Problem 8 - GCR Methods Level 1
 * Program to demonstrate StringIndexOutOfBoundsException.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.Scanner;

public class StringOutofBound {
    // Method to generate StringIndexOutOfBoundsException
    public static void genexception(String text){
        System.out.println(text.charAt(text.length()));
    }
    // Method to handle StringIndexOutOfBoundsException
    public static void handlexception(String text){
         try {
            // Accessing an index beyond the length of the String
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        // First call the method that generates the exception

        genexception(s);
        // Then call the method that handles the exception
        handlexception(s);
        sc.close();
    }
}
