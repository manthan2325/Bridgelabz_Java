package JavaMultiThreadingFolder.MakingBasicThread;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecuterServiceExecutorsFuture11 {
    public static void main(String[] args) throws Exception {

        // 1. Define a task that returns an integer.
        Callable<Integer> task = () -> {
            System.out.println("Calculating in: "
                    + Thread.currentThread().getName());

            Thread.sleep(2000);

            return 10 + 20;
        };

        // 2. Create an executor that manages a worker thread.
        ExecutorService e = Executors.newSingleThreadExecutor();

        // 3. Submit the task for execution.
        Future<Integer> future = e.submit(task);

        System.out.println("Task submitted.");
        System.out.println("Main can do other work here.");

        // 4. Retrieve the result. This waits if the task isn't finished.
        int result = future.get();

        System.out.println("Result: " + result);

        // 5. Tell the executor we don't need to submit more tasks.
        e.shutdown();
    }
}

// what is the differnce then, i mean the thread also kind of executes tasks right? so like what is this executor different, you said the main can do it taks while the executor 
// will executes its own, but i guess just the thread also does the same thing right? 