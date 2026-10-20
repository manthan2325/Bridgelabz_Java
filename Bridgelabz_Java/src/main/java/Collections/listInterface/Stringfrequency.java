package main.java.Collections.listInterface;
import java.util.*;


public class Stringfrequency {
    public static void main(String[] args) {
        Map<String,Integer> mpp = new HashMap<>();
        List<String> arr = new ArrayList<>(Arrays.asList("Manthan","Manthan","Aditya","Abrar"));

        for(String s : arr){
            if(mpp.containsKey(s)){
                mpp.put(s,mpp.get(s) + 1);
            }else{
                mpp.put(s,1);
            }
        }
        System.out.println(mpp);
    }
}
