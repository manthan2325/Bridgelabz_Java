/*
 * Problem 8 - GCR Control Flow Level 2
 * Create a program to find the youngest friends among 3 Amar, Akbar, and
 * Anthony based on their ages and the tallest among the friends based on their
 * heights
 * Hint =>
 * Take user input for the age and height of the 3 friends and store it in a
 * variable
 * Find the smallest of the 3 ages to find the youngest friend and display it
 * Find the largest of the 3 heights to find the tallest friend and display it
 * 
 * 
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Amar's height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Akbar's height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = sc.nextDouble();

        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest friend: Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest friend: Akbar");
        } else {
            System.out.println("Youngest friend: Anthony");
        }

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest friend: Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest friend: Akbar");
        } else {
            System.out.println("Tallest friend: Anthony");
        }

        sc.close();
    }
}