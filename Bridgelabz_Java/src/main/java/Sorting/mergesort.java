import java.util.Arrays;

public class mergesort {
    static void mergesorts(int left,int right,int[] arr){
        if(left >= right){
            return;
        }
        int mid = (left + right) / 2;
         mergesorts(left, mid, arr);
         mergesorts(mid+1, right, arr);
         merge(left,mid,right,arr);
    }
    static void merge(int left,int mid,int right,int[] arr){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] l1 = new int[n1];
        int[] l2 = new int[n2];
        for(int i=0;i<n1;i++){
            l1[i] = arr[left + i];
        }
        for(int i=0;i<n2;i++){
            l2[i] = arr[mid + 1 + i];
        }
        int i=0;
        int j=0;
        int k = left;
        while(i < n1 && j < n2){
            if(l1[i] < l2[j]){
                arr[k++] = l1[i++];
            }else{
                arr[k++] = l2[i++];
            }
        }
        while(i < n1){
            arr[k++] = l1[i++];
        }
        while(j < n2){
            arr[k++] = l2[j++];
        }
    }
    public static void main(String[] args){
        int[] arr = {5,3,1,8,4,2,6,7,9};
        int n = arr.length;
        mergesorts(0,n-1,arr);
        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }
}
// Best = worst = average = O(nlogn) and auxillary space = O(N)