package JavaMultiThreadingFolder.MakingBasicThread;

public class NoSYncCounter {
    private int count = 0;

    public  void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
