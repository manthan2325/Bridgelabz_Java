import java.util.*;

public class Zerosum {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,3,-1};
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        map.put(0,new ArrayList<>());
        map.get(0).add(-1);

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];

            if(map.containsKey(sum)){
                for(int prev: map.get(sum)){
                    for(int j=prev+1;j<=i;j++){
                        System.out.print(arr[j] + " ");
                    }
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }
}
