package JavaExceptions.Assignment1;


public class Nestedtryandcatch {
    public static void main(String[] args) {
        int[] arr = {20, 40, 60};
        int index = 1;
        int divisor = 2;

        try {
            int value = arr[index];

            try {
                System.out.println("Result: " + (value / divisor));

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}