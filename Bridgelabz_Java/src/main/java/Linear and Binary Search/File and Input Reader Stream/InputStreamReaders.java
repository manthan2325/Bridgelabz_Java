
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaders {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            );
            FileWriter fw = new FileWriter("output.txt")
        ) {
            String line;

            System.out.println("Enter text (type 'exit' to stop):");

            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(line);
                fw.write(System.lineSeparator());
            }

            System.out.println("Input successfully written to output.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
