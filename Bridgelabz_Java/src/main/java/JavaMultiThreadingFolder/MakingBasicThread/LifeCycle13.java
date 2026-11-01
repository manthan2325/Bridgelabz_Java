package JavaMultiThreadingFolder.MakingBasicThread;



public class LifeCycle13 {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            System.out.println("Worker is executing");
        });

        System.out.println("Before start: " + t.getState());

        t.start();

        t.join();

        System.out.println("After join: " + t.getState());
    }
}
