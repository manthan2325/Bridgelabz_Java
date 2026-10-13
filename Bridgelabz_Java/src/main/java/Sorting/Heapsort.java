
import java.util.Arrays;

public class Heapsort {

    static void heapsort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract maximum repeatedly
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Restore heap, excluding sorted elements
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int ind) {
        int largest = ind;
        int left = 2 * ind + 1;
        int right = 2 * ind + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != ind) {
            int temp = arr[ind];
            arr[ind] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 30, 50, 20};

        heapsort(arr);

        System.out.println(
            "Array is sorted: " + Arrays.toString(arr)
        );
    }
}
