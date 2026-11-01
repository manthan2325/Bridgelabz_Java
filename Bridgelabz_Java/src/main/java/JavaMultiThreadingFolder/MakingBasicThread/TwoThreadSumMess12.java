package JavaMultiThreadingFolder.MakingBasicThread;


import java.util.concurrent.atomic.AtomicInteger;

public class TwoThreadSumMess12 {
    public static void main(String[] args) throws InterruptedException {

        AtomicInteger sum = new AtomicInteger(1);

        Thread t1 = new Thread(() -> {
            
            for (int i = 1; i < 10; i++)    
                {
                int multiplier = i; // we need this by the way as we wont be able to change the value or use i sum.updateAndGet(value -> value * i); cause i is chaging
                
                System.out.println("T1: i is " + i+" and sum is " + sum.get());
                sum.updateAndGet(value -> value * multiplier);
                
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 100; i++) {
                System.out.println("T2: i is " + i+" and sum is " + sum.get());
                sum.addAndGet(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final sum: " + sum.get());
    }
}