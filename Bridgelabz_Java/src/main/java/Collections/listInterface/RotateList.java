package main.java.Collections.listInterface;
import java.util.*;


public class RotateList {
    static void reverse(List<Integer> arr,int low,int high){
        while(low < high){
            int temp = arr.get(low);
            arr.set(low,arr.get(high));
            arr.set(high,temp);

            low++;
            high--;
        }
    }
    static void rotate(List<Integer> arr,int k){
        int n = arr.size();
        k = k % n;
        reverse(arr,0,n-1);

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int k = 2;
        rotate(arr,k);

        System.out.println(arr);
    }
}
