package JavaMultiThreadingFolder.AtomicTrying;
import java.util.concurrent.atomic.AtomicInteger;
class Student {
    int sum;
    public Student(int sum) {
        this.sum = sum;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public void addToSum(int value) {
        this.sum += value;
    }
    public void multiplySum(int value) {
        this.sum *= value;
    }
}
public class AtomicClasses15 
{
    public static void main(String[] args) 
    {
        Student s = new Student(1);
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 10; i++) 
            {
                
                System.out.println("T1: i is " + i + " and sum is " + s.getSum());
                
                s.multiplySum(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                
                
                s.addToSum(i);
            }
        });
        
        t1.start();
        t2.start();
        try
        {
            t1.join();
            
            t2.join();
            
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        System.out.println("Final sum: " + s.getSum());
    }
}
