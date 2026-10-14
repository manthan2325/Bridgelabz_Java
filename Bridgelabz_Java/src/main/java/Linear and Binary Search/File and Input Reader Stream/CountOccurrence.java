import java.io.BufferedReader;
import java.io.FileReader;

public class CountOccurrence {
    public static void main(String[] args) {
        String target = "the";          // the word to search for
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");      // split on one or more spaces
                for (String w : words) {
                    if (w.equalsIgnoreCase(target)) {     // compare content, ignore case
                        count++;
                    }
                }
            }
            System.out.println("Word '" + target + "' appears " + count + " times");
        } catch (Exception e) {
            System.out.println("Error found : " + e);
        }
    }
}