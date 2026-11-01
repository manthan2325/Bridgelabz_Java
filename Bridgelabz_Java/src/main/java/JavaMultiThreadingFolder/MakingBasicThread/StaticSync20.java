package JavaMultiThreadingFolder.MakingBasicThread;

public class StaticSync20 
{
    public static void main(String[] args)
    {
        StaticSyncCounter counter1 = new StaticSyncCounter();
        StaticSyncCounter counter2 = new StaticSyncCounter();
        // look the methord is static so we should call it with StaticSyncCounter.increment()
        // just know the memory is still syncronised among the object so eevn if we have different object they will update
        // the same memory
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter2.increment();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       

        System.out.println("Final count: " + counter1.getCount());
    }
}
