import java.util.*;

public class KeyhighestValue {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,2,4,4,4,5,3));
        int n = arr.size();
        for(int i=0;i<n;i++){
            map.put(arr.get(i),map.getOrDefault(arr.get(i), 0)+1);
        }        
        long maxi = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value = entry.getValue();
            maxi = Math.max(maxi,value);
        }
        System.out.println("Maximum value is : " + maxi);
    }
}
