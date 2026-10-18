import java.util.*;

class SortStackRecursion_{
    static void insertStack(Stack<Integer> st,int element){
        if(st.isEmpty() || st.peek() <= element){
            st.push(element);
            return;
        }
        int top = st.pop();

        insertStack(st, element);

        st.push(top);
    }
    static void Sortstack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int element = st.pop();

        Sortstack(st);

        insertStack(st,element);

    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        
        st.push(30);
        st.push(10);
        st.push(50);
        st.push(20);
        st.push(40);

        System.out.println("Original Stack: " + st);

        // Sort the st
        Sortstack(st);

        System.out.println("Sorted Stack: " + st);
    }
}