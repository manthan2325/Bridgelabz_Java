package main.java.Collections.listInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Reverselist{
    static void reverse(List<Integer> list){
        int low = 0;
        int high = list.size() - 1;
        while(low < high){
            int temp = list.get(low);
            list.set(low,list.get(high));
            list.set(high,temp);

            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>( Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> temp = new LinkedList<>( Arrays.asList(1, 2, 3, 4, 5));

        reverse(arr);
        System.out.println(arr);

        reverse(temp);
        System.out.println(temp);
    }
}