import java.util.*;

public class CircularTour {
    static int findstart(int[] petrol,int[] distance){
        int n = petrol.length;
        int[] net = new int[n];

        int total = 0;
        for(int i=0;i<n;i++){
            net[i] = petrol[i] - distance[i];
            total +=  net[i];
        }
        if(total < 0){
            return -1;
        }
        Queue<Integer> q = new LinkedList<>();
        int balance = 0;
        int i = 0;
        while(q.size() < n){
            balance += net[i];

            q.offer(i);
            while(balance < 0){
                int rem = q.poll();
                balance -= net[rem];
            }
            i = (i + 1)%n;
        }
        return q.peek();

    }
    public static void main(String[] args) {
        int[] petrol = {4,6,7,4};
        int[] distance = {6,5,3,5};

        int start = findstart(petrol,distance);
        if (start == -1) {
            System.out.println("No solution exists");
        } else {
            System.out.println("Starting pump index: " + start);
        }

    }
}
