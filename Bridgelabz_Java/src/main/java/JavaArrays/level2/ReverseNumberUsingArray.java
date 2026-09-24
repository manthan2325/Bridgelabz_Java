/*
1. Create a program to take a number as input and reverse the number. To do this, store the
digits of the number in an array and display the array in reverse order

Hint =>
1. Take user input for a number.
2. Find the count of digits in the number.
3. Find the digits in the number and save them in an array.
4. Create an array to store the elements of the digits array in reverse order.
5. Finally, display the elements of the array in reverse order.

* Author: Asher Mustafa
* Date: 23-09-2026
*/

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store the absolute value to handle the digits.
        int temp = Math.abs(number);

        // Find the number of digits.
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

        // Store the digits in their original order.
        temp = Math.abs(number);

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] reverse = new int[digitCount];

        // Store the digits in reverse order.
        for (int i = 0; i < digitCount; i++) {
            reverse[i] = digits[digitCount - 1 - i];
        }

        // Display the reversed number.
        System.out.print("Reverse of the number: ");

        if (number < 0) {
            System.out.print("-");
        }

        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]);
        }

        System.out.println();

        sc.close();
    }
}