package JavaMultiThreadingFolder.MakingBasicThread;

public class StaticSyncCounter 
{
    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
