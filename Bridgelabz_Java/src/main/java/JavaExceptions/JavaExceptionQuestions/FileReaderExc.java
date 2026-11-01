package JavaExceptions.JavaExceptionQuestions;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExc {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
            reader.close();
        } catch (IOException e) {
            System.out.println("Unable to access the file.");
        }
    }
}