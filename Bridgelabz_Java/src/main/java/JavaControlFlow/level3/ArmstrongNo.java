
/*
 * Problem 1 - GCR Control Flow Level 3
 * Create a program to check if a number is Armstrong or not
 * Hint =>
 * Armstrong Number is a number whose sum of cubes of each digit results in the
 * original number e.g. 153 = 1^3 + 5^3 + 3^3
 * Get an integer input, initialize sum to zero, and store the input in
 * originalNumber for comparison after the loop.
 * Use the while loop until number is not equal to zero.
 * In the while loop find the remainder using number % 10, cube the remainder,
 * and add it to sum.
 * Find the quotient using number / 10 to remove the last digit.
 * Finally check if the original number and sum are the same.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */
import java.util.*;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalNo = sc.nextInt();
        int sum = 0;
        while(originalNo != 0){
            int a = originalNo % 10;
            int b = (int) Math.pow(a,3);
            sum += b;
            originalNo = originalNo / 10;
        }
        if(sum == originalNo){
            System.err.println("This is a ArmStrong no");
        }else{
            System.err.println("This is not a Armstrong no");
        }
        sc.close();
    }
}