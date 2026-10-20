import java.util.*;

public class ReverseItems {
    static void revqueue(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int front = q.remove();
        revqueue(q);
        q.add(front);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Original queue is : " + q);
        revqueue(q);
        System.out.println("reverse queue is : " + q);

    }
}
