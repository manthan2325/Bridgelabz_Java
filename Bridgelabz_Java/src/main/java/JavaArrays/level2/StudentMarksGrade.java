/*
4. Create a program to take input marks of students in 3 subjects physics, chemistry, and maths.
Compute the percentage and then calculate the grade as per the following guidelines.

Grade A: 80% and above
Grade B: 70-79%
Grade C: 60-69%
Grade D: 50-59%
Grade E: 40-49%
Grade R: 39% and below

Hint =>
1. Take input for the number of students.
2. Create arrays to store marks, percentages, and grades of the students.
3. Take input for marks of students in physics, chemistry, and maths. If the marks are negative,
ask the user to enter positive values and decrement the index.
4. Calculate the percentage and grade of the students based on the percentage.
5. Display the marks, percentages, and grades of each student.

* Author: Asher Mustafa
* Date: 23-09-2026
*/

import java.util.Scanner;

public class StudentMarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // Take valid marks for every student.
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));

            do {
                System.out.print("Enter Physics marks: ");
                physics[i] = sc.nextInt();

                if (physics[i] < 0 || physics[i] > 100) {
                    System.out.println("Please enter marks between 0 and 100.");
                }
            } while (physics[i] < 0 || physics[i] > 100);

            do {
                System.out.print("Enter Chemistry marks: ");
                chemistry[i] = sc.nextInt();

                if (chemistry[i] < 0 || chemistry[i] > 100) {
                    System.out.println("Please enter marks between 0 and 100.");
                }
            } while (chemistry[i] < 0 || chemistry[i] > 100);

            do {
                System.out.print("Enter Maths marks: ");
                maths[i] = sc.nextInt();

                if (maths[i] < 0 || maths[i] > 100) {
                    System.out.println("Please enter marks between 0 and 100.");
                }
            } while (maths[i] < 0 || maths[i] > 100);
        }

        // Calculate percentage and grade for every student.
        for (int i = 0; i < number; i++) {
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Display marks, percentage, and grade.
        System.out.println("\nStudent Results");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1)
                    + " | Physics: " + physics[i]
                    + " | Chemistry: " + chemistry[i]
                    + " | Maths: " + maths[i]
                    + " | Percentage: " + percentage[i] + "%"
                    + " | Grade: " + grade[i]);
        }

        sc.close();
    }
}
