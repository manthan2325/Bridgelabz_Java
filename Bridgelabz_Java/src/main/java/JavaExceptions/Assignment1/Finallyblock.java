package JavaExceptions.Assignment1;


import java.util.Scanner;
import java.util.InputMismatchException;

public class Finallyblock {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            System.out.println("Result: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");

        } catch (InputMismatchException e) {
            System.out.println("Enter valid integers!");

        } finally {
            System.out.println("Operation completed");
        }
    }
}