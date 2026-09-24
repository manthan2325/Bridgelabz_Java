import java.util.*;

/*
 * Problem 1 - GCR Methods Level 1
 * Create a program to divide N number of chocolates among M children.
 * Print the number of chocolates each child will get and also the
 * remaining chocolates.
 *
 * Hint =>
 * Get an integer value from the user for the numberOfChocolates
 * and numberOfChildren.
 * Write a method to find the number of chocolates each child gets
 * and the number of remaining chocolates.
 *
 * Method:
 * public static int[] findRemainderAndQuotient(int number, int divisor)
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class ChocolateDistribution {
    // Method to calculate chocolates per child and remaining chocolates
    public static int[] func(int a,int b){
        int distributed = a % b;
        int remaining = a / b;
        return new int[]{distributed,remaining};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input for number of chocolates and children
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = func(m,n);
        // Display the number of chocolates each child gets
        System.out.println("Chocolates Distributed:" + arr[0]);
        // Display the remaining chocolates
        System.out.println("Remaining Chocolates:" + arr[1]);
        sc.close();
    }
}
