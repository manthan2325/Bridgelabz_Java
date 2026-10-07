import java.util.Scanner;

class StudentNode {
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {

    StudentNode head;

    // 1. Insert at beginning
    void insertAtBeginning(int rollNo, String name, int age, char grade) {

        StudentNode newNode =
            new StudentNode(rollNo, name, age, grade);

        newNode.next = head;
        head = newNode;

        System.out.println("Student added at beginning.");
    }

    // 2. Insert at end
    void insertAtEnd(int rollNo, String name, int age, char grade) {

        StudentNode newNode =
            new StudentNode(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            System.out.println("Student added at end.");
            return;
        }

        StudentNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        System.out.println("Student added at end.");
    }

    // 3. Insert at specific position
    void insertAtPosition(int rollNo, String name, int age,
                          char grade, int position) {

        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            insertAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode newNode =
            new StudentNode(rollNo, name, age, grade);

        StudentNode temp = head;

        // Reach the node before the required position
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position does not exist.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Student added at position " + position);
    }

    // 4. Delete student by Roll Number
    void deleteByRollNo(int rollNo) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If first node needs to be deleted
        if (head.rollNo == rollNo) {
            head = head.next;

            System.out.println("Student deleted.");
            return;
        }

        StudentNode temp = head;

        while (temp.next != null &&
               temp.next.rollNo != rollNo) {

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
            return;
        }

        // Remove the node
        temp.next = temp.next.next;

        System.out.println("Student deleted.");
    }

    // 5. Search student by Roll Number
    void searchByRollNo(int rollNo) {

        StudentNode temp = head;

        while (temp != null) {

            if (temp.rollNo == rollNo) {

                System.out.println("\nStudent Found!");
                System.out.println("Roll Number: " + temp.rollNo);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);

                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found.");
    }

    // 6. Display all students
    void display() {

        if (head == null) {
            System.out.println("No student records.");
            return;
        }

        StudentNode temp = head;

        System.out.println("\n===== Student Records =====");

        while (temp != null) {

            System.out.println("Roll Number: " + temp.rollNo);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            System.out.println("---------------------------");

            temp = temp.next;
        }
    }

    // 7. Update grade
    void updateGrade(int rollNo, char newGrade) {

        StudentNode temp = head;

        while (temp != null) {

            if (temp.rollNo == rollNo) {

                temp.grade = newGrade;

                System.out.println("Grade updated successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Student not found.");
    }
}

public class StudentRecordManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentLinkedList list = new StudentLinkedList();

        int choice;

        do {

            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add at beginning");
            System.out.println("2. Add at end");
            System.out.println("3. Add at specific position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Display all students");
            System.out.println("7. Update grade");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll1 = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name1 = sc.next();

                    System.out.print("Enter Age: ");
                    int age1 = sc.nextInt();

                    System.out.print("Enter Grade: ");
                    char grade1 = sc.next().charAt(0);

                    list.insertAtBeginning(
                        roll1, name1, age1, grade1
                    );
                    break;

                case 2:
                    System.out.print("Enter Roll Number: ");
                    int roll2 = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name2 = sc.next();

                    System.out.print("Enter Age: ");
                    int age2 = sc.nextInt();

                    System.out.print("Enter Grade: ");
                    char grade2 = sc.next().charAt(0);

                    list.insertAtEnd(
                        roll2, name2, age2, grade2
                    );
                    break;

                case 3:
                    System.out.print("Enter Roll Number: ");
                    int roll3 = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name3 = sc.next();

                    System.out.print("Enter Age: ");
                    int age3 = sc.nextInt();

                    System.out.print("Enter Grade: ");
                    char grade3 = sc.next().charAt(0);

                    System.out.print("Enter Position: ");
                    int position = sc.nextInt();

                    list.insertAtPosition(
                        roll3, name3, age3, grade3, position
                    );
                    break;

                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    int deleteRoll = sc.nextInt();

                    list.deleteByRollNo(deleteRoll);
                    break;

                case 5:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = sc.nextInt();

                    list.searchByRollNo(searchRoll);
                    break;

                case 6:
                    list.display();
                    break;

                case 7:
                    System.out.print("Enter Roll Number: ");
                    int updateRoll = sc.nextInt();

                    System.out.print("Enter new Grade: ");
                    char newGrade = sc.next().charAt(0);

                    list.updateGrade(updateRoll, newGrade);
                    break;

                case 8:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }
}