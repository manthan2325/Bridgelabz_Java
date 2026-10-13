import java.util.Stack;

class QueueUsingStack{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    void enqueue(int data){
        st1.push(data);
        System.out.println("data enqueued ");
    }
    int dequeue(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.peek());
                st1.pop();
            }
        }
        if(st2.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return st2.pop();
    }
    int peek(){

        if(st2.isEmpty()){
            while(st1.isEmpty()){
                st2.push(st1.peek());
                st1.pop();
            }
        }
        if(st2.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return st2.peek();
    }
    public static void main(String[] args){
        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Dequeued " + q.dequeue());
        System.out.println("Dequeued " + q.dequeue());

        q.enqueue(4);

        System.out.println("Front: " + q.peek());
    }
}
