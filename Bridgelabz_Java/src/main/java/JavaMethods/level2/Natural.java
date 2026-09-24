import java.util.Scanner;

/*
 * Problem 1 - GCR Methods Level 1
 * Write a program to find the sum of n natural numbers using recursive method
 * and compare the result with the formula n*(n+1)/2.
 *
 * Hint =>
 * 1. Take the user input number and check whether it's a Natural number, if not exit.
 * 2. Write a Method to find the sum of n natural numbers using recursion.
 * 3. Write a Method to find the sum of n natural numbers using the formula n*(n+1)/2.
 * 4. Compare the two results and print the result.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class Natural {
    static int func(int num){
        return (num * (num + 1))/2;
    }
    public static int recursivefunc(int n) {

        // Base condition
        if (n == 0) {
            return 0;
        }

        return n + recursivefunc(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 0){
            System.out.println("Not a Natural Number");
        }else{
            int formula = func(num);
            int recursive = recursivefunc(num);
            if(formula == recursive){
                System.out.println("Same Result");
            }else{
                System.out.println("Not the Same Result");
            }
        }
        sc.close();
    }
}
