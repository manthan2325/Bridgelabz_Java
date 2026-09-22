/*
 * Problem 1 - GCR Arrays Level 2
 * Write a program to store multiple values in an array up to a maximum of 10
 * or until the user enters a 0 or a negative number. Show all the numbers
 * as well as the sum of all numbers.
 * Hint =>
 * Create a double array of 10 elements to store the numbers.
 * Create a double variable total initialized to 0.0.
 * Create an integer index variable initialized to 0 to track the array position.
 * Use an infinite while loop using while (true).
 * Take user input and check if the user entered 0 or a negative number.
 * If the user entered 0 or a negative number, break from the loop.
 * Also, break from the loop if the index reaches 10 because the array size
 * is limited to 10 elements.
 * If the user enters a positive number, store it in the array and increment
 * the index value.
 * Use another for loop to access each stored element and add it to the total.
 * Finally, display all the numbers stored in the array and display the total sum.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class StoreMultiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int index = 0;

        while(true) {

            int num = sc.nextInt();

            if(num <= 0) {
                break;
            }

            if(index == 10) {
                break;
            }

            arr.add(num);
            index++;
        }

        int total = 0;

        for(int i = 0; i < index; i++) {
            System.out.println(arr.get(i));
            total += arr.get(i);
        }

        System.out.println("Total = " + total);

        sc.close();
    }
}