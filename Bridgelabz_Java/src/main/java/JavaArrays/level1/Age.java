import java.util.*;

/*
 * Problem 1 - GCR Control Flow Level 3
 * Create a program to check if a number is an Abundant Number
 * Hint =>
 * An abundant number is an integer in which the sum of all the divisors
 * of the number is greater than the number itself.
 * For example, the divisors of 12 are 1, 2, 3, 4, and 6.
 * Sum of divisors: 1 + 2 + 3 + 4 + 6 = 16 > 12.
 * Get an integer input for the number variable.
 * Create an integer variable sum with initial value 0.
 * Use a for loop from i = 1 to i < number.
 * Inside the loop, check if the number is divisible by i.
 * If the number is divisible by i, add i to sum.
 * Outside the loop, check if sum is greater than number.
 * If the sum is greater than the number, print Abundant Number.
 * Otherwise, print Not an Abundant Number.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] >= 18){
                System.err.println("The student with the age can vote");
            }else{
                System.err.println("The student with the age cannot vote");
            }
        }
        sc.close();
    }
}
