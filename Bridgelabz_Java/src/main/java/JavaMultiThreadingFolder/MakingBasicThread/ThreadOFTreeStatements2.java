package JavaMultiThreadingFolder.MakingBasicThread;

public class ThreadOFTreeStatements2 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread(()->
        {System.out.println("Hello from A"); 
        System.out.println("Hello from B"); 
        });
        t.start();
        
        System.out.println("Hello from C");
       
    }
}
// What I want to show is that depending on the main thread or the thread t we will have the sequence of output , it can be A, B ,c or C,B ,A or A, C ,B like that.
// Do note that thread preserve the order of there own statements SO A and B is fixed order of execution meaning B always come after A even in (A,C,B) when C is in the middle cause the
// scheduler decided to pause the thread t, but C can be Anywhere.