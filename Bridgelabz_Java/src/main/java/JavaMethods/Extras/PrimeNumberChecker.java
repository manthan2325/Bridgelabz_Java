/*
 * Problem 7 - Prime Number Checker
 *
 * Program to check whether a given number is a prime number.
 *
 * A prime number is a number greater than 1 that has only two
 * factors: 1 and the number itself.
 *
 * The program:
 * 1. Takes an integer as input from the user.
 * 2. Calls a separate method to check whether the number is prime.
 * 3. Checks if the number is divisible by any number from 2
 *    up to its square root.
 * 4. Returns true if the number is prime, otherwise returns false.
 * 5. Displays the result.
 *
 * Hint =>
 * 1. Create a method to check whether a number is prime.
 * 2. A number less than or equal to 1 is not prime.
 * 3. Check divisibility from 2 up to the square root of the number.
 * 4. Return true if no divisor is found.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class PrimeNumberChecker {

    // Method to check whether a number is prime
    public static boolean isPrime(int number) {

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Check for factors
        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call the prime check method
        boolean result = isPrime(number);

        // Display the result
        if (result) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        sc.close();
    }
}