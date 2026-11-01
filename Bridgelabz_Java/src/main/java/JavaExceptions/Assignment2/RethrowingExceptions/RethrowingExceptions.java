package JavaExceptions.Assignment2.RethrowingExceptions;

import java.io.*;
public class RethrowingExceptions {
    static int performDivision(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }

        return numerator / denominator;
    }

    static int calculate(int numerator, int denominator) throws ArithmeticException {
        try {
            return performDivision(numerator, denominator);

        } catch (ArithmeticException e) {
            throw new ArithmeticException("Calculation failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            int result = calculate(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}