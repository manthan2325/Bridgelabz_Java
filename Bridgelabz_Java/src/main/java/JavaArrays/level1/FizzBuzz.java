import java.util.*;

/*
 * Problem 1 - GCR Arrays Level 2
 * Write a program for FizzBuzz.
 * Take a number as user input and check if it is a positive integer.
 * If it is positive, loop from 0 to the number and save the number in
 * a String array.
 * For multiples of 3, save "Fizz" instead of the number.
 * For multiples of 5, save "Buzz" instead of the number.
 * For multiples of both 3 and 5, save "FizzBuzz".
 * Finally, print the array results for each index position in the format
 * Position 1 = 1, Position 3 = Fizz, and so on.
 * Hint =>
 * Create a String array to save the FizzBuzz results.
 * Use a loop to check each number and store the appropriate result in the array.
 * Finally, loop through the array again to display the results based on
 * the index position.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n+1];
        if(n > 0){
            for(int i=0;i<=n;i++){
                if(i % 3 ==0 && i % 5 == 0){
                    arr[i] = "FizzBuzz";
                }else if(i % 3 == 0){
                    arr[i] = "Fizz";
                }else if(i % 5 == 0){
                    arr[i] = "Buzz";
                }else{
                    continue;
                }
             }
        }
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
