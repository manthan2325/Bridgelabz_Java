import java.util.Arrays;

public class QuickSort {
    static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(arr[j] <= pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
    
        return i+1;
    }
    static void quicksort(int low,int high,int[] arr){
        if(low < high){
            int index = partition(arr,low,high);

            quicksort(low, index-1, arr);
            quicksort(index+1, high, arr);

        }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,5,8,9,7};
        int n = arr.length;
        quicksort(0,n-1,arr);

        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }
}
/*Case	Time complexity
Best	\(O(n\log n)\)
Average	\(O(n\log n)\)
Worst	\(O(n^2)\)
Auxiliary space	\(O(\log n)\) average recursion stack */