/*
 * Problem 21 - GCR Methods Level 1
 *
 * Program to generate the age of 10 students and check whether each
 * student is eligible to vote based on their age.
 *
 * The program:
 * 1. Generates random 2-digit ages for n students.
 * 2. Stores the ages in a 1D integer array.
 * 3. Checks whether each student can vote.
 * 4. Stores the age and voting result in a 2D String array.
 * 5. Displays the student age and voting result in tabular format.
 *
 * Hint =>
 * 1. Create a method to generate random 2-digit ages for n students
 *    and return the ages in a 1D array.
 * 2. Create a method that takes the age array and returns a 2D String
 *    array containing the age and true or false for voting eligibility.
 * 3. If the age is negative, the student cannot vote.
 * 4. If the age is 18 or above, the student can vote.
 * 5. Create a method to display the 2D String array in tabular format.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.Scanner;

public class Students {

    public static int[] func(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = 10 + (int)(Math.random() * 50);
        }
        return arr;
    }
    public static String[][] Student(int[] arr){
        int n = arr.length;
        String[][] result = new String[n][2];
        for(int i=0;i<n;i++){
            int age = arr[i];
            result[i][0] = String.valueOf(age);
            if(age < 0){
                result[i][1] = "false";
            }else if(age  < 18){
                result[i][1] = "false";
            }else{
                result[i][1] = "true";
            }
        }
        return result;
    }
    public static void displayResult(String[][] result) {

        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("-------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                    result[i][0] + "\t" +
                    result[i][1]
            );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] age = func(n);
        String[][] result = Student(age);
        displayResult(result);

        sc.close();
    }
}
