package main.java.Collections.listInterface;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));

        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(mpp.containsKey(arr.get(i))){
                arr.remove(i);
                i--;
            }else{
                mpp.put(arr.get(i),1);
            }
        }
        System.out.println(arr);
    }
}
