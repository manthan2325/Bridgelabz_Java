/*
5. Rewrite the above program to store the marks of the students in physics, chemistry, and maths
in a 2D array and then compute the percentage and grade.

Hint =>
1. All the steps are the same as the problem 8 except the marks are stored in a 2D array.
2. Use the 2D array to calculate the percentages and grades of the students.

* Author: Asher Mustafa
* Date: 23-09-2026
*/

import java.util.Scanner;

public class StudentMarksGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        // Take valid marks for Physics, Chemistry, and Maths.
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) {
                        System.out.print("Enter Physics marks: ");
                    } else if (j == 1) {
                        System.out.print("Enter Chemistry marks: ");
                    } else {
                        System.out.print("Enter Maths marks: ");
                    }

                    marks[i][j] = sc.nextInt();

                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Please enter marks between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
        }

        // Calculate percentage and grade using the 2D marks array.
        for (int i = 0; i < number; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
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

        // Display the marks, percentage, and grade.
        System.out.println("\nStudent Results");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1)
                    + " | Physics: " + marks[i][0]
                    + " | Chemistry: " + marks[i][1]
                    + " | Maths: " + marks[i][2]
                    + " | Percentage: " + percentage[i] + "%"
                    + " | Grade: " + grade[i]);
        }

        sc.close();
    }
}
