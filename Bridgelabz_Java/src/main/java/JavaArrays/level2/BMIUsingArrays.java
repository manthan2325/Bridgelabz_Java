/*
2. An organization took up an exercise to find the Body Mass Index (BMI) of all the persons
in the team. For this create a program to find the BMI and display the height, weight, BMI
and status of each individual.

Hint =>
1. Take input for a number of persons.
2. Create arrays to store the weight, height, BMI, and weight status of the persons.
3. Take input for the weight and height of the persons.
4. Calculate the BMI of all the persons and store them in an array and also find the weight status
of the persons.
5. Display the height, weight, BMI, and weight status of each person.
6. Use the table to determine the weight status of the person.

BMI Status:
<= 18.4      Underweight
18.5 - 24.9  Normal
25.0 - 39.9  Overweight
>= 40.0      Obese

* Author: Asher Mustafa
* Date: 23-09-2026
*/

import java.util.Scanner;

public class BMIUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];

        // Take valid weight and height input for every person.
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));

            do {
                System.out.print("Enter weight in kg: ");
                weight[i] = sc.nextDouble();

                if (weight[i] <= 0) {
                    System.out.println("Please enter a positive weight.");
                }
            } while (weight[i] <= 0);

            do {
                System.out.print("Enter height in meters: ");
                height[i] = sc.nextDouble();

                if (height[i] <= 0) {
                    System.out.println("Please enter a positive height.");
                }
            } while (height[i] <= 0);
        }

        // Calculate BMI and determine the weight status.
        for (int i = 0; i < number; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details of every person.
        System.out.println("\nPerson Details");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1)
                    + " | Height: " + height[i] + " m"
                    + " | Weight: " + weight[i] + " kg"
                    + " | BMI: " + bmi[i]
                    + " | Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
