package JavaMultiThreadingFolder.CyclicBarriers;


import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierNames {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        Runnable task = () -> {
            try {
                for (int i = 0; i < 3; i++) 
                {
                 
                String name = Thread.currentThread().getName();

                System.out.println(name + " is working "+i);
                

                System.out.println(name + " reached the barrier "+i);
                barrier.await();

                System.out.println(name + " continues after the barrier "+i);
            }

            } 
            catch (Exception e) 
            {
                Thread.currentThread().interrupt();
            }
            
        };

        new Thread(task, "Thread-A").start();
        new Thread(task, "Thread-B").start();
        new Thread(task, "Thread-C").start();
    }
}