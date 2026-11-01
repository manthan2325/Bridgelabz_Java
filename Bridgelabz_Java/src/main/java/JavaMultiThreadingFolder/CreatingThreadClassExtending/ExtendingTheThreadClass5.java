package JavaMultiThreadingFolder.CreatingThreadClassExtending;


class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Hello from A");
        System.out.println("Hello from B");
    }
}
public class ExtendingTheThreadClass5 {
    public static void main(String[] args) 
    {
        MyThread t = new MyThread();
        t.start();
        System.out.println("Hello from C");
    }
}
