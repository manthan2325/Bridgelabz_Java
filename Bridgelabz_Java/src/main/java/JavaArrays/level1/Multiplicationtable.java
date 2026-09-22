/*
 * Problem 1 - GCR Arrays Level 1
 * Create a program to print a multiplication table of a number.
 * Hint =>
 * Get an integer input and store it in the number variable.
 * Define an integer array to store the results of multiplication from 1 to 10.
 * Run a loop from 1 to 10 and store the multiplication results in the array.
 * Finally, display the result from the array in the format number * i = ___.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        
        for(int i=1;i<=10;i++){
            arr[i-1] = n * i;
        }
        for(int i=1;i<= 10;i++){
            System.out.println(n + " * " + i + "=" + arr[i-1]);
        }
        sc.close();
    }
}