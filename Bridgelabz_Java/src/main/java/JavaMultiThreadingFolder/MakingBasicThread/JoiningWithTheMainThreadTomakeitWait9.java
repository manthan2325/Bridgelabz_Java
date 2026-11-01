package JavaMultiThreadingFolder.MakingBasicThread;



public class JoiningWithTheMainThreadTomakeitWait9 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Worker: " + i);
                
            }
        });

        t.start();

        System.out.println("Main: Done");
        try
        {
            Thread.sleep(1000); 
            /*This line is essential cause without it our output was  
            Main: Done
            Main: Waiting will now wait ------------- for worker thread to finish
            Worker: 1
            Worker: 1
            Worker: 2
            Worker: 2
            Worker: 3
            Worker: 3
            Worker: 4
            Worker: 4
            Worker: 5
            Worker: 5
            Main: Done
            Now listen, for some reason the main is given more priority than the worker thread.
            so as you can see it will execute till it can execute till this line of ----------
            but after that we are doing a join, that cause main to pause before t2 can be over , but now t1 and t2 are having the same priority and as
            you will observe they are running like alternatively in round robin so we go that output, so keep that in mind, we make the 
            main to sleep and that cause the shedular to give contorl to the t1 so that it can finish itself and we didnt really reach t2 till then , after that we came back to the main so we printing -------
            and  then join caused it to wait for t2 now */
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread was interrupted while waiting.");
        } 
        // Sleep for 1 second to allow the worker thread to finish
        System.out.println("Main: Waiting will now wait ------------- for worker thread to finish");
        Thread t2 = new Thread(() -> {
            
            for (int i = 1; i <= 5; i++) {
                System.out.println("Worker: " + i);
            }
        });
        try
        {
            t2.start();
            t2.join();
        }
        catch(IllegalThreadStateException e)
        {
            System.out.println("Thread has already been started and cannot be started again.");
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread was interrupted while waiting.");
        }
        System.out.println("Main: Done");
        System.out.println("Priority of t :"+ t.getPriority());
        System.out.println("Priority of t2 :"+ t2.getPriority());
        System.out.println("Priority of main :"+ Thread.currentThread().getPriority());
    }
}
