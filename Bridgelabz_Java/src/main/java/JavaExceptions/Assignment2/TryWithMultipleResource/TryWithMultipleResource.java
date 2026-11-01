package JavaExceptions.Assignment2.TryWithMultipleResource;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithMultipleResource {
    public static void main(String[] args) {
        try (
            BufferedReader reader1 =
                new BufferedReader(new FileReader("file1.txt"));

            BufferedReader reader2 =
                new BufferedReader(new FileReader("file2.txt"));

            BufferedWriter writer =
                new BufferedWriter(new FileWriter("combined.txt"))
        ) {
            String line;

            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Files combined successfully.");

        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}