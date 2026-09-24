/*
6. Create a program to take a number as input, find the frequency of each digit in the number
using an array, and display the frequency of each digit.

Hint =>
1. Take the input for a number.
2. Find the count of digits in the number.
3. Find the digits in the number and save them in an array.
4. Find the frequency of each digit in the number. For this define a frequency array of size 10,
loop through the digits array, and increase the frequency of each digit.
5. Display the frequency of each digit in the number.

* Author: Asher Mustafa
* Date: 23-09-2026
*/

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find the number of digits.
        int temp = Math.abs(number);
        int digitCount = 0;

        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp > 0) {
                digitCount++;
                temp /= 10;
            }
        }

        int[] digits = new int[digitCount];

        // Store each digit in the digits array.
        temp = Math.abs(number);
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];

        // Count the frequency of each digit.
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of every digit.
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " = " + frequency[i]);
            }
        }

        sc.close();
    }
}
