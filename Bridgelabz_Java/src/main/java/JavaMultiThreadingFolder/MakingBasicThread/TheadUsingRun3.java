package JavaMultiThreadingFolder.MakingBasicThread;

public class TheadUsingRun3 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread(()->{System.out.println("Hello from A"); System.out.println("Hello from B"); });
        t.run();
        System.out.println("Hello from C");
       
    }
}