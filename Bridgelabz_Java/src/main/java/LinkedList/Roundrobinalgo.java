import java.util.Scanner;

class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    int arrivalTime;
    int completionTime;

    ProcessNode next;

    ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;

        this.arrivalTime = 0;
        this.completionTime = 0;

        this.next = null;
    }
}

class RoundRobinScheduler {

    ProcessNode head;
    ProcessNode tail;

    // Add process at the end
    void addProcess(int id, int burstTime, int priority) {

        ProcessNode newNode =
                new ProcessNode(id, burstTime, priority);

        if (head == null) {
            head = newNode;
            tail = newNode;

            // Circular connection
            tail.next = head;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    // Remove a process by ID
    void removeProcess(int id) {

        if (head == null) {
            return;
        }

        // Only one node
        if (head == tail) {

            if (head.processId == id) {
                head = null;
                tail = null;
            }

            return;
        }

        // Removing head
        if (head.processId == id) {

            head = head.next;
            tail.next = head;
            return;
        }

        ProcessNode temp = head;

        while (temp.next != head &&
               temp.next.processId != id) {

            temp = temp.next;
        }

        // Process found
        if (temp.next.processId == id) {

            temp.next = temp.next.next;

            // If deleting tail
            if (temp.next == head) {
                tail = temp;
            }
        }
    }

    // Display current circular list
    void displayProcesses() {

        if (head == null) {
            System.out.println("No processes remaining.");
            return;
        }

        ProcessNode temp = head;

        System.out.print("Processes: ");

        do {
            System.out.print(
                    "P" + temp.processId +
                    "(" + temp.remainingTime + ")"
            );

            temp = temp.next;

            if (temp != head) {
                System.out.print(" -> ");
            }

        } while (temp != head);

        System.out.println(" -> back to P" + head.processId);
    }

    // Round Robin scheduling
    void schedule(int quantum) {

        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int currentTime = 0;

        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int processCount = countProcesses();

        ProcessNode current = head;

        System.out.println("\n===== ROUND ROBIN SCHEDULING =====");

        while (head != null) {

            System.out.println(
                    "\nExecuting P" + current.processId
            );

            // Process finishes within this quantum
            if (current.remainingTime <= quantum) {

                currentTime += current.remainingTime;

                current.remainingTime = 0;

                current.completionTime = currentTime;

                int turnaroundTime =
                        current.completionTime -
                        current.arrivalTime;

                int waitingTime =
                        turnaroundTime -
                        current.burstTime;

                totalTurnaroundTime += turnaroundTime;
                totalWaitingTime += waitingTime;

                int completedId = current.processId;

                // Find next process before deleting
                ProcessNode nextProcess = current.next;

                removeProcess(completedId);

                System.out.println(
                        "P" + completedId + " completed."
                );

                if (head == null) {
                    break;
                }

                current = nextProcess;

                // If nextProcess was the deleted head,
                // use the new head
                if (current == null) {
                    current = head;
                }

            } else {

                current.remainingTime -= quantum;

                currentTime += quantum;

                current = current.next;
            }

            System.out.println(
                    "Current Time: " + currentTime
            );

            displayProcesses();

            // Safety: if current somehow points to
            // a removed node, start from head
            if (head != null) {
                current = findProcess(current);

                if (current == null) {
                    current = head;
                }
            }
        }

        System.out.println("\n===== RESULTS =====");

        double averageWaitingTime =
                (double) totalWaitingTime / processCount;

        double averageTurnaroundTime =
                (double) totalTurnaroundTime / processCount;

        System.out.println(
                "Average Waiting Time = "
                + averageWaitingTime
        );

        System.out.println(
                "Average Turnaround Time = "
                + averageTurnaroundTime
        );
    }

    // Find same process in current list
    ProcessNode findProcess(ProcessNode node) {

        if (head == null || node == null) {
            return null;
        }

        ProcessNode temp = head;

        do {

            if (temp.processId == node.processId) {
                return temp;
            }

            temp = temp.next;

        } while (temp != head);

        return null;
    }

    // Count processes
    int countProcesses() {

        if (head == null) {
            return 0;
        }

        int count = 0;

        ProcessNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}

public class Roundrobinalgo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RoundRobinScheduler scheduler =
                new RoundRobinScheduler();

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nProcess " + i);

            System.out.print("Enter Burst Time: ");
            int burstTime = sc.nextInt();

            System.out.print("Enter Priority: ");
            int priority = sc.nextInt();

            scheduler.addProcess(
                    i,
                    burstTime,
                    priority
            );
        }

        System.out.print("\nEnter Time Quantum: ");
        int quantum = sc.nextInt();

        System.out.println("\nInitial Circular Queue:");
        scheduler.displayProcesses();

        scheduler.schedule(quantum);

        sc.close();
    }
}