package JavaMultiThreadingFolder.MakingBasicThread;



public class ThreadLifeCycle17 {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                System.out.println("Worker is running");
                System.out.println(Thread.currentThread().getName() + " State 4: " + Thread.currentThread().getState());
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " State 5: " + Thread.currentThread().getState());
                System.out.println("Worker finished sleeping");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        },"Worker Bro");

        System.out.println(Thread.currentThread().getName() + " State 1: " + t.getState());

        t.start();

        Thread.sleep(200);

        System.out.println(Thread.currentThread().getName() + " State 2: " + t.getState());

        t.join();

        System.out.println(Thread.currentThread().getName() + " State 3: " + t.getState());
    }
}