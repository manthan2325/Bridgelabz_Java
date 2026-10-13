import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,8,4,2,6,7,9};
        int n  = arr.length;

        for(int i=0;i<n-1;i++){
            int mini = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
        System.out.println("sorted array is : " + Arrays.toString(arr));
    }
}
/*Best, average, and worst time: \(O(n^2)\)their correct positions.


Auxiliary space: \(O(1)\) */