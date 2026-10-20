import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordFrequencyCount {
    public static void main(String[] args) {
        String filename = "input.txt";
        Map<String,Integer> wordcount = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = br.readLine()) != null){
                line =  line.toLowerCase().replaceAll("[^a-z0-9\\s]"," ");
                String[] words = line.trim().split("\\s+");
                for(String word : words){
                    if(!word.isEmpty()){
                        wordcount.put(word,wordcount.getOrDefault(word,0) + 1);
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Error" + e);
        }
    }    
}
