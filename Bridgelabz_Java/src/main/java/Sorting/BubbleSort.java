import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        int[] arr = {5,3,1,8,4};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }
}
