package JavaMultiThreadingFolder.LIVELOCK;



import java.util.concurrent.CyclicBarrier;

public class LiveLock1 {

    static final CyclicBarrier barrier = new CyclicBarrier(2);

    static void move(String person, int round) {
        String direction = (round % 2 == 1) ? "LEFT" : "RIGHT";

        System.out.println(person + " steps " + direction);

        try {
            // Wait until both people have made their move
            barrier.await();

            System.out.println(
                    person + " realizes the other person is also blocking the way!"
            );

            // Both finish this round before trying again
            barrier.await();

        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Thread personA = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                move("Person A", i);
            }
        });

        Thread personB = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                move("Person B", i);
            }
        });

        personA.start();
        personB.start();
    }
}