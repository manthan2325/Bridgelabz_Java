import java.util.*;

/*
 * Problem 1 - GCR Methods Level 1
 * Write a program to take user input for the age of all 10 students
 * in a class and check whether the student can vote depending on
 * whether his/her age is greater than or equal to 18.
 *
 * Hint =>
 * 1. Create a class StudentVoteChecker and define a method
 *    public boolean canStudentVote(int age) which takes age as
 *    a parameter and returns true or false.
 * 2. Inside the method firstly validate the age for a negative number.
 *    If negative, return false. For valid age, check if age is
 *    18 or above, return true; else return false.
 * 3. In the main function define an array of 10 integer elements,
 *    loop through the array by taking user input for the student's age,
 *    call canStudentVote() and display the result.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

public class StudentVoteChecker {
    // Method to check whether a student can vote
    public static boolean func(int age){
        boolean flag = false;
        if(age >= 18){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
         // Create an array to store ages of 10 students
        int[] arr = new int[n];
         // Take input for 10 students
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            // Check voting eligibility
            boolean check = func(arr[i]);
             // Display result
            if(check){
                System.out.println("Student can Vote");
            }else{
                System.out.println("Student cannot Vote");
            }
        }
        sc.close();
    }
}
