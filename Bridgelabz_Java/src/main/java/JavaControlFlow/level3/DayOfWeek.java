/*
 * Problem 5 - GCR Control Flow Level 3
 * Create a program to count the number of digits in an integer.
 * Hint =>
 * Get an integer input for the number variable.
 * Create an integer variable count with value 0.
 * Use a loop to iterate until number is not equal to 0.
 * Remove the last digit from number in each iteration
 * Increase count by 1 in each iteration.
 * Finally display the count to show the number of digits
 * 
 * 
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter m(month: ");
        int m = sc.nextInt();

        System.out.println("enter d (day): ");
        int d = sc.nextInt();

        System.out.println("enter y (year): ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int day = (d + x + (31 * m0 / 12)) % 7;

        System.out.println(day);
        sc.close();
    }
}