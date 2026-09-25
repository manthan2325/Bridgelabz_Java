/*
 * Problem 13 - GCR Methods Level 1
 * Write a program to generate a six-digit OTP number using Math.random().
 * Validate the numbers are unique by generating the OTP number 10 times
 * and ensuring all the 10 OTPs are not the same.
 *
 * Hint =>
 * 1. Write a method to generate a 6-digit OTP number using Math.random().
 * 2. Create an array to save the OTP numbers generated 10 times.
 * 3. Write a method to ensure that the OTP numbers generated are unique.
 *    If unique return true else return false.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {

        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to check whether all OTPs are unique
    public static boolean areUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {

            for (int j = i + 1; j < otps.length; j++) {

                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Create array to store 10 OTPs
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {

            otps[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");

        for (int i = 0; i < otps.length; i++) {

            System.out.println("OTP " + (i + 1) + " = " + otps[i]);
        }

        // Check whether all OTPs are unique
        boolean result = areUnique(otps);

        if (result) {
            System.out.println("\nAll 10 OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are repeated.");
        }
    }
}