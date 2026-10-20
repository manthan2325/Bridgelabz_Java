package main.java.Collections.listInterface;
import java.util.*;

public class NthLinkedlist {
    static int nthele(List<Integer> arr,int k){
        Iterator<Integer> first = arr.iterator();
        Iterator<Integer> second = arr.iterator();

        for(int i=0;i<k;i++){
            first.next();
        }
        Integer result = null;
        while(first.hasNext()){
            first.next();
            result = second.next();
        }
        if(second.hasNext()){
            result = second.next();
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int k = 2;
        int ele = nthele(arr,k);
        System.out.println("the nth element is : " + ele);
    }
}
