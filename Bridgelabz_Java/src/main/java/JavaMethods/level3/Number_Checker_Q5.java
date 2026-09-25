/*
 * Problem 11 - GCR Methods Level 1
 * Extend or Create a NumberChecker utility class and perform
 * different checks on a number.
 *
 * Hint =>
 * 1. Method to check if a number is a Prime Number.
 * 2. Method to check if a number is a Neon Number.
 * 3. Method to check if a number is a Spy Number.
 * 4. Method to check if a number is an Automorphic Number.
 * 5. Method to check if a number is a Buzz Number.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Number_Checker_Q5 {

    // Method to check whether the number is a Prime Number
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to check whether the number is a Neon Number
    public static boolean isNeon(int number) {

        int square = number * number;
        int sum = 0;

        while (square != 0) {

            int digit = square % 10;
            sum += digit;
            square = square / 10;
        }

        return sum == number;
    }

    // Method to check whether the number is a Spy Number
    public static boolean isSpy(int number) {

        int sum = 0;
        int product = 1;

        while (number != 0) {

            int digit = number % 10;

            sum += digit;
            product *= digit;

            number = number / 10;
        }

        return sum == product;
    }

    // Method to check whether the number is an Automorphic Number
    public static boolean isAutomorphic(int number) {

        int square = number * number;
        int temp = number;

        while (temp != 0) {

            if (square % 10 != temp % 10) {
                return false;
            }

            square = square / 10;
            temp = temp / 10;
        }

        return true;
    }

    // Method to check whether the number is a Buzz Number
    public static boolean isBuzz(int number) {

        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number as input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check Prime Number
        if (isPrime(number)) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Check Neon Number
        if (isNeon(number)) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }

        // Check Spy Number
        if (isSpy(number)) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is not a Spy Number.");
        }

        // Check Automorphic Number
        if (isAutomorphic(number)) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is not an Automorphic Number.");
        }

        // Check Buzz Number
        if (isBuzz(number)) {
            System.out.println(number + " is a Buzz Number.");
        } else {
            System.out.println(number + " is not a Buzz Number.");
        }

        sc.close();
    }
}