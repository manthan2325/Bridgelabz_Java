package JavaMultiThreadingFolder.MakingBasicThread;
import java.util.concurrent.Callable;
public class CallableImplementation10 
{
    public static void main(String[] args) 
    {
        Callable<String> c = ()->{
        return "Hello from A";
        };
        
        Thread t = new Thread(()->{
            try {
                System.out.println(c.call());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        t.start();
        }
   
}
