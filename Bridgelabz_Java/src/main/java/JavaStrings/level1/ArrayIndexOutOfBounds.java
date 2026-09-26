/*
 * Problem 11 - GCR Methods Level 1
 * Program to demonstrate ArrayIndexOutOfBoundsException.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class ArrayIndexOutOfBounds {
     // Method to generate the exception
    public static void gen(int[] arr){
        System.out.println(arr[arr.length]);
    }
     // Method to handle the exception
    public static void handle(int[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of Bounds");
        }
    }
    public static void main(String[] args) {
        // Take number of elements
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // First call the method that generates the exception
        //gen(arr);
        // Then call the method that handles the exception
        handle(arr);
        sc.close();
    }
}
