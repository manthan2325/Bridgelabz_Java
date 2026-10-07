import java.util.Scanner;

class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;

    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {

    TaskNode head;

    // 1. Add task at beginning
    void insertAtBeginning(int taskId, String taskName,
                           int priority, String dueDate) {

        TaskNode newNode =
                new TaskNode(taskId, taskName, priority, dueDate);

        // Empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TaskNode temp = head;

        // Find the last node
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // 2. Add task at end
    void insertAtEnd(int taskId, String taskName,
                     int priority, String dueDate) {

        TaskNode newNode =
                new TaskNode(taskId, taskName, priority, dueDate);

        // Empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TaskNode temp = head;

        // Find last node
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // 3. Add task at specific position
    void insertAtPosition(int taskId, String taskName,
                          int priority, String dueDate,
                          int position) {

        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            insertAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        if (head == null) {
            System.out.println("Position does not exist.");
            return;
        }

        TaskNode newNode =
                new TaskNode(taskId, taskName, priority, dueDate);

        TaskNode temp = head;

        for (int i = 1; i < position - 1; i++) {

            temp = temp.next;

            if (temp == head) {
                System.out.println("Position does not exist.");
                return;
            }
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Remove task by Task ID
    void deleteByTaskId(int taskId) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Only one node
        if (head.next == head) {

            if (head.taskId == taskId) {
                head = null;
                System.out.println("Task deleted.");
            } else {
                System.out.println("Task not found.");
            }

            return;
        }

        // Deleting head
        if (head.taskId == taskId) {

            TaskNode temp = head;

            // Find last node
            while (temp.next != head) {
                temp = temp.next;
            }

            head = head.next;
            temp.next = head;

            System.out.println("Task deleted.");
            return;
        }

        // Deleting any other node
        TaskNode temp = head;

        while (temp.next != head &&
               temp.next.taskId != taskId) {

            temp = temp.next;
        }

        if (temp.next == head) {
            System.out.println("Task not found.");
            return;
        }

        temp.next = temp.next.next;

        System.out.println("Task deleted.");
    }

    // 5. View current task
    void viewCurrentTask() {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        displayTask(head);
    }

    // 6. Move to next task
    void moveToNextTask() {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        head = head.next;

        System.out.println("Moved to next task.");
        displayTask(head);
    }

    // 7. Display all tasks
    void displayAll() {

        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;

        System.out.println("\n===== All Tasks =====");

        do {

            displayTask(temp);

            temp = temp.next;

        } while (temp != head);
    }

    // 8. Search by priority
    void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {

            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("No task found with this priority.");
        }
    }

    // Display one task
    void displayTask(TaskNode task) {

        System.out.println("-------------------------");
        System.out.println("Task ID: " + task.taskId);
        System.out.println("Task Name: " + task.taskName);
        System.out.println("Priority: " + task.priority);
        System.out.println("Due Date: " + task.dueDate);
    }
}

public class TaskSchedulerSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskScheduler scheduler = new TaskScheduler();

        int choice;

        do {

            System.out.println("\n===== Task Scheduler =====");
            System.out.println("1. Add task at beginning");
            System.out.println("2. Add task at end");
            System.out.println("3. Add task at position");
            System.out.println("4. Delete task by ID");
            System.out.println("5. View current task");
            System.out.println("6. Move to next task");
            System.out.println("7. Display all tasks");
            System.out.println("8. Search by priority");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Task ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name: ");
                    String name1 = sc.nextLine();

                    System.out.print("Enter Priority: ");
                    int priority1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Due Date: ");
                    String date1 = sc.nextLine();

                    scheduler.insertAtBeginning(
                            id1, name1, priority1, date1
                    );

                    break;

                case 2:

                    System.out.print("Enter Task ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name: ");
                    String name2 = sc.nextLine();

                    System.out.print("Enter Priority: ");
                    int priority2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Due Date: ");
                    String date2 = sc.nextLine();

                    scheduler.insertAtEnd(
                            id2, name2, priority2, date2
                    );

                    break;

                case 3:

                    System.out.print("Enter Task ID: ");
                    int id3 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name: ");
                    String name3 = sc.nextLine();

                    System.out.print("Enter Priority: ");
                    int priority3 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Due Date: ");
                    String date3 = sc.nextLine();

                    System.out.print("Enter Position: ");
                    int position = sc.nextInt();

                    scheduler.insertAtPosition(
                            id3, name3, priority3, date3, position
                    );

                    break;

                case 4:

                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = sc.nextInt();

                    scheduler.deleteByTaskId(deleteId);

                    break;

                case 5:

                    scheduler.viewCurrentTask();

                    break;

                case 6:

                    scheduler.moveToNextTask();

                    break;

                case 7:

                    scheduler.displayAll();

                    break;

                case 8:

                    System.out.print("Enter Priority: ");
                    int searchPriority = sc.nextInt();

                    scheduler.searchByPriority(searchPriority);

                    break;

                case 9:

                    System.out.println("Program ended.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        sc.close();
    }
}