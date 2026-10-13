import java.util.Arrays;

public class CountingSort {
    static void countingsort(int[] arr){
        int n = arr.length;
        int max = 18;
        int min = 10;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[arr.length];

        for(int i=0;i<n;i++){
            int num = arr[i] - min;
            count[num]++;
        }
        for(int i=1;i<range;i++){
            count[i] += count[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            int age = arr[i];
            int index = age - min;

            output[count[index] - 1] = age;
            count[index]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {14,10,12,14,11,12,10,18};

        countingsort(arr);
        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }
}
