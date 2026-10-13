import java.util.*;

public class SlidingWindowMaximum_ {
    static int[] maxSlidingWindow(int[] arr,int k){
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[arr.length-k+1];
        int index = 0;

        for(int i=0;i<arr.length;i++){

            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if(i >= k-1){
                result[index] = arr[dq.peekFirst()];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = maxSlidingWindow(arr, k);

        System.out.println(Arrays.toString(result));
    }
}
