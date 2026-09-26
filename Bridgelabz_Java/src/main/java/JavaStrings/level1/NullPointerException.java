import java.util.*;

/*
  * Problem 7 - GCR Methods Level 1
  * Program to demonstrate NullPointerException.
  *
  * Author: Manthan Hanchate
  * Date: 21-09-2026
  */

public class NullPointerException {
    // Method to generate NullPointerException
    public static void genexception(){
        String text = null;
        System.out.println(text.length());
    }
    // Method to handle NullPointerException
    public static void handleexception(){
        String text = null;

        try {
            System.out.println(text.length());
        } catch (java.lang.NullPointerException e) {
            System.out.println("Exception handled:");
        }
    }
    public static void main(String[] args) {
        // First call the method that generates the exception
        // genexception();

        // After refactoring, call the method that handles the exception
        handleexception();
    }
}
