package JavaMultiThreadingFolder.MakingBasicThread;


public class Volatile21 {
    static  boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            int i =0;
            while (running) {
                // Keep working
                 if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Worker noticed interruption");
                    return;
                }
                i++;
            }
            System.out.println("No of iterations: " + i);
            System.out.println("Worker stopped");
        });

        worker.start();

        Thread.sleep(3);

        running = false;

        worker.join(5000);

        System.out.println("Main finished");
        worker.interrupt();
    }
}