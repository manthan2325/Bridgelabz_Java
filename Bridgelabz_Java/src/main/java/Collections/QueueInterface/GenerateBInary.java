import java.util.*;

public class GenerateBInary {
    static List<String> generate(int n){
        List<String> arr = new ArrayList<>();
        if(n <= 0) return arr;

        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i=0;i<n;i++){
            String curr = q.remove();
            arr.add(curr);

            q.offer(curr + "0");
            q.offer(curr + "1");
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(5));        
    }
}
