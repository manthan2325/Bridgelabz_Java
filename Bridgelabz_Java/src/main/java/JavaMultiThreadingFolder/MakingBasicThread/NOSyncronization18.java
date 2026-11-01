package JavaMultiThreadingFolder.MakingBasicThread;


// public class NoSYncCounter {
//     private int count = 0;

//     public  void increment() {
//         count++;
//     }

//     public int getCount() {
//         return count;
//     }
// }


public class NOSyncronization18 {
    public static void main(String[] args) throws InterruptedException {
        NoSYncCounter counter = new NoSYncCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }
}