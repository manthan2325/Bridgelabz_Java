
import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // Check if the required number was seen earlier
            if (map.containsKey(complement)) {
                System.out.println(
                    "Pair found: " + complement + ", " + arr[i]
                );
                return;
            }

            // Store the current number and its index
            map.put(arr[i], i);
        }

        System.out.println("Pair not found");
    }
}