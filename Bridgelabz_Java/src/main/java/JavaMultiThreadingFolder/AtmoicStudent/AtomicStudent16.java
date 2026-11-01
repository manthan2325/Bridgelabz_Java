package JavaMultiThreadingFolder.AtmoicStudent;


import java.util.concurrent.atomic.AtomicInteger;

class Student {
    private final AtomicInteger sum;

    public Student(int sum) {
        this.sum = new AtomicInteger(sum);
    }

    public int getSum() {
        return sum.get();
    }

    public void addToSum(int value) {
        sum.addAndGet(value);
    }

    public void multiplySum(int value) {
        sum.updateAndGet(current -> current * value);
    }
}

public class AtomicStudent16 {
    public static void main(String[] args) throws InterruptedException {
        Student s = new Student(1);

        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                int multiplier = i;
                
                System.out.println("T1: i = " + multiplier +", sum before multiplication = " + s.getSum());

                s.multiplySum(multiplier);
            }
        });
      
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("T2: i = " + i +", sum before addition = " + s.getSum());
                s.addToSum(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final sum: " + s.getSum());
    }
}