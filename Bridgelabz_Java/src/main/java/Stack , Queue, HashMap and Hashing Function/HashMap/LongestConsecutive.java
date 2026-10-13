
import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        // Store all elements in the set
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;
        int start = 0;

        for (int num : set) {

            // Start only if num is the first element
            // of a consecutive sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                // Count consecutive elements
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (length > maxLength) {
                    maxLength = length;
                    start = num;
                }
            }
        }

        System.out.println(
            "Longest consecutive sequence length: " + maxLength
        );

        System.out.print("Sequence: ");
        for (int i = 0; i < maxLength; i++) {
            System.out.print((start + i) + " ");
        }
    }
}