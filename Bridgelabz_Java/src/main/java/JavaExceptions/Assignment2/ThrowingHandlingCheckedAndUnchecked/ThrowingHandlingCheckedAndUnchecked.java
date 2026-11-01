package JavaExceptions.Assignment2.ThrowingHandlingCheckedAndUnchecked;


import java.io.IOException;

public class ThrowingHandlingCheckedAndUnchecked {
    static void processData(int value) throws IOException {
        if (value < 0) {
            throw new IllegalArgumentException(
                "Value cannot be negative"
            );
        }

        if (value == 0) {
            throw new IOException(
                "Cannot process zero value"
            );
        }

        System.out.println("Data processed: " + value);
    }

    public static void main(String[] args) {
        int[] values = {-5, 0, 10};

        for (int value : values) {
            try {
                processData(value);

            } catch (IOException e) {
                System.out.println("Checked exception: " + e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Unchecked exception: " + e.getMessage());
            }
        }
    }
}