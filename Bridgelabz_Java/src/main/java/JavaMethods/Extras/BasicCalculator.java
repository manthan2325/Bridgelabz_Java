/*
 * Problem 12 - Basic Calculator
 *
 * Program to perform basic mathematical operations based on
 * the user's choice.
 *
 * The program:
 * 1. Takes two numbers as input from the user.
 * 2. Displays the available mathematical operations.
 * 3. Takes the user's choice of operation.
 * 4. Performs addition, subtraction, multiplication or division
 *    using separate methods.
 * 5. Displays the result.
 *
 * Hint =>
 * 1. Create a separate method for addition.
 * 2. Create a separate method for subtraction.
 * 3. Create a separate method for multiplication.
 * 4. Create a separate method for division.
 * 5. Ask the user to choose which operation to perform.
 *
 * Author: Manthan Hanchate
 * Date: 21-09-2026
 */

import java.util.*;

public class BasicCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double result;

        switch (choice) {

            case 1:
                result = add(number1, number2);
                System.out.println("Result: " + result);
                break;

            case 2:
                result = subtract(number1, number2);
                System.out.println("Result: " + result);
                break;

            case 3:
                result = multiply(number1, number2);
                System.out.println("Result: " + result);
                break;

            case 4:
                if (number2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = divide(number1, number2);
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}