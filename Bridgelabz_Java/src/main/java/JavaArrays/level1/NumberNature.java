/*
 * Problem 1 - GCR Arrays Level 1
 * Write a program to take user input for 5 numbers and check whether a number
 * is positive, negative, or zero. Further, for positive numbers check if the
 * number is even or odd. Finally, compare the first and last elements of the
 * array and display if they are equal, greater, or less.
 * Hint =>
 * Define an integer array of 5 elements and get user input to store in the array.
 * Loop through the array using the length property.
 * If the number is positive, check if the number is even or odd and print accordingly.
 * If the number is negative, print Negative.
 * If the number is zero, print Zero.
 * Finally, compare the first and last elements of the array.
 * If both elements are equal, print Equal.
 * If the first element is greater than the last element, print Greater.
 * Otherwise, print Less.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class NumberNature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                System.out.println("Positive Number");
                if(arr[i] % 2 == 0){
                    System.out.println("Even Number");
                }else{
                    System.out.println("Odd Number");
                }
            }else if(arr[i] < 0){
                System.out.println("Negative Number");
            }else{
                System.out.println("0");
            }
        }
        int first = arr[0];
        int last = arr[n-1];
        if(first > last){
            System.out.println("First element is Greater");
        }else if(first < last){
            System.out.println("Last element is greater");
        }else{
            System.out.println("Both Elements are equal");
        }
        sc.close();
    }
}
