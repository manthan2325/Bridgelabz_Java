import java.util.*;

public class SortedList {
    static <T extends Comparable<T>> List<T> sortedlist(Set<T> st){
        List<T> arr = new ArrayList<>(st);
        Collections.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>(Arrays.asList(4,3,2,1));
        System.out.println("Sorted list is : " + sortedlist(st));
    }
}
