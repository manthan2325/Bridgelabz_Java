/*
 * Problem 1 - GCR Control Flow Level 2
 * Rewrite program 1 to determine Leap Year with single if condition using
 * logical and && and or || operators
 * 
 * 
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.Scanner;

public class rewriteOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }

        sc.close();
    }
}