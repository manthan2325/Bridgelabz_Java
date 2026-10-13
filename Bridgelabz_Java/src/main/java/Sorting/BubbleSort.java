import java.util.Arrays;
//we compare adjacents elements in order to sort the elements.
public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {75,45,90,32,60};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }
}