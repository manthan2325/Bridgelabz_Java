package JavaExceptions.JavaExceptionQuestions;
public class NumberFormatExce {
    public static void main(String[] args) {
        String input = "Asher";

        try {
            int divisor = Integer.parseInt(input);
            int result = 100 / divisor;

            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("End of program.");
    }
}