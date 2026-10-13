import java.util.*;

public class StockSpan {
    static int findspan(Stack<Integer> st,int element,Stack<Integer> spanst){
        int cnt = 1;
        while(!st.isEmpty() && st.peek() <= element){
                cnt += spanst.pop();
                st.pop();
        }
        return cnt;
    }
    static void span(Stack<Integer> st,Stack<Integer> spanst,int[] arr,int index){
        if(st.isEmpty()){
            return;
        }
        int element = st.pop();

        span(st,spanst,arr,index-1);
        int val = findspan(st,element,spanst);
        arr[index] = val;
        st.push(element);
        spanst.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();        
        Stack<Integer> spanst = new Stack<>();
        st.push(100);
        st.push(80);
        st.push(60);
        st.push(70);
        st.push(60);
        st.push(75);
        st.push(85);

        int[] arr = new int[7];
        int index = arr.length -1;
        span(st,spanst,arr,index);
        for(int i=0;i<arr.length;i++){
            System.out.println("Span elements are : " + arr[i]);
        }
    }
}
