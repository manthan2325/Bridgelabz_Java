package JavaMultiThreadingFolder.MakingBasicThread;


public class PausingTheMainUsingSLEEP8 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread(()->
        {System.out.println("Hello from A"); 
        System.out.println("Hello from B"); 
        });
        t.start();
        try {
            Thread.currentThread().sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from C");
       
    }
}
// we get
// Hello from A
// Hello from B
// Hello from C
// cause we pause the main before it hit the print statement of C so the thread t get a chance to run and finish its execution before main thread print C