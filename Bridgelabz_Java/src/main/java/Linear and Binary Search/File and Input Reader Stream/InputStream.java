
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class InputStream {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(
            new InputStreamReader(
                new FileInputStream("data.txt"),
                StandardCharsets.UTF_8))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error found : " + e);
        }
    }
}
