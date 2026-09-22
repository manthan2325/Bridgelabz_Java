/*
 * Problem 7 - GCR Control Flow Level 2
 * Create a program to find the BMI of a person
 * Hint =>
 * Take user input in double for the weight (in kg) of the person and height (in
 * cm) for the person and store it in the corresponding variable.
 * Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For
 * this convert cm to meter
 * Use the table to determine the weight status of the person
 * 
 * 
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height cm: ");
        double heightcm = sc.nextDouble();

        // Convert height from cm to meter
        double height = heightcm / 100;

        // Calculate BMI
        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);

        if (bmi <= 18.4) {
            System.out.println("Status = Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status = Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status = Overweight");
        } else {
            System.out.println("Status = Obese");
        }

        sc.close();
    }
}