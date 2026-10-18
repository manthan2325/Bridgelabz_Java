import java.util.*;

public class LinearBinary {
    static int LinearSearch(int[] arr,int target){
      int n = arr.length;
      for(int i=0;i<n;i++){
        if(arr[i] == target){
          return i;
        }
      }
      return -1;
    }
    static int BinarySearch(int[] arr,int target){
      int n = arr.length;
      int low = 0;
      int high = n-1;
      while(low <= high){
        int mid = (low + high) /2;
        if(arr[mid] == target){
          return mid;
        }
        else if(target < arr[mid]){
          high = mid -1;
        }else{
          low = mid + 1;
        }
      }
      return -1;
    }
    public static void main(String[] args) {
      int[] arr = {1,3,4,6,8,9};
      int target = 6;

      long start = System.nanoTime();
      LinearSearch(arr,target);
      long end = System.nanoTime();
      long final1 = end - start;

      long start1 = System.nanoTime();
      BinarySearch(arr,target);
      long end1 = System.nanoTime();

      long final2 = end1 -start1;

      System.out.println("Time for linear search is : " + final1);
      System.out.println("Time for Binary search is : " + final2);
    }
}