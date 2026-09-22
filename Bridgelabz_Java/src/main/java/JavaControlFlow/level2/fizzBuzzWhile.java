/*
 * Problem 6 - GCR Control Flow Level 2
 *Rewrite the program 5 FizzBuzz using while loop 
 * 
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.Scanner;

public class fizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 0;

        if (n > 0) {
            while (i <= n) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");

                } else if (i % 3 == 0) {
                    System.out.println("Fizz");

                } else if (i % 5 == 0) {
                    System.out.println("Buzz");

                } else {
                    System.out.println(i);
                }

                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        sc.close();
    }

}