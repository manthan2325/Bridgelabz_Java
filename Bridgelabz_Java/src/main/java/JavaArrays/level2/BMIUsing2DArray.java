/*
3. Rewrite the above program using multi-dimensional array to store height, weight, and BMI
in 2D array for all the persons.

Hint =>
1. Take input for a number of persons.
2. Create a multi-dimensional array to store weight, height and BMI. Also create an array
to store the weight status of the persons.

double[][] personData = new double[number][3];
String[] weightStatus = new String[number];

3. Take input for weight and height of the persons and for negative values, ask the user to enter positive values.
4. Calculate BMI of all the persons and store them in the personData array and also find the weight status
and put them in the weightStatus array.
5. Display the height, weight, BMI and status of each person.

* Author: Asher Mustafa
* Date: 23-09-2026
*/

import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Store weight and height for every person.
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));

            do {
                System.out.print("Enter weight in kg: ");
                personData[i][0] = sc.nextDouble();

                if (personData[i][0] <= 0) {
                    System.out.println("Please enter a positive weight.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height in meters: ");
                personData[i][1] = sc.nextDouble();

                if (personData[i][1] <= 0) {
                    System.out.println("Please enter a positive height.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and store it in the third column.
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0]
                    / (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display weight, height, BMI, and status.
        System.out.println("\nPerson Details");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1)
                    + " | Height: " + personData[i][1] + " m"
                    + " | Weight: " + personData[i][0] + " kg"
                    + " | BMI: " + personData[i][2]
                    + " | Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
