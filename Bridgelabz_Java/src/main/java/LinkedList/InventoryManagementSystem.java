import java.util.Scanner;

class ItemNode {
    String itemName;
    int itemId;
    int quantity;
    double price;

    ItemNode next;

    ItemNode(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {

    ItemNode head;

    // 1. Add item at beginning
    void insertAtBeginning(String name, int id,
                            int quantity, double price) {

        ItemNode newNode =
                new ItemNode(name, id, quantity, price);

        newNode.next = head;
        head = newNode;
    }

    // 2. Add item at end
    void insertAtEnd(String name, int id,
                     int quantity, double price) {

        ItemNode newNode =
                new ItemNode(name, id, quantity, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 3. Add item at specific position
    void insertAtPosition(String name, int id,
                          int quantity, double price,
                          int position) {

        if (position <= 0) {
            System.out.println("Invalid position.");
            return;
        }

        if (position == 1) {
            insertAtBeginning(name, id, quantity, price);
            return;
        }

        ItemNode newNode =
                new ItemNode(name, id, quantity, price);

        ItemNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position does not exist.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 4. Remove item by Item ID
    void deleteById(int id) {

        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        // Delete first node
        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item deleted.");
            return;
        }

        ItemNode temp = head;

        while (temp.next != null &&
               temp.next.itemId != id) {

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found.");
            return;
        }

        temp.next = temp.next.next;

        System.out.println("Item deleted.");
    }

    // 5. Update quantity by Item ID
    void updateQuantity(int id, int newQuantity) {

        ItemNode temp = head;

        while (temp != null) {

            if (temp.itemId == id) {
                temp.quantity = newQuantity;

                System.out.println("Quantity updated.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found.");
    }

    // 6. Search by Item ID
    void searchById(int id) {

        ItemNode temp = head;

        while (temp != null) {

            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found.");
    }

    // 7. Search by Item Name
    void searchByName(String name) {

        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {

            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    // 8. Calculate total inventory value
    void calculateTotalValue() {

        ItemNode temp = head;

        double total = 0;

        while (temp != null) {

            total += temp.price * temp.quantity;

            temp = temp.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }

    // 9. Display inventory
    void display() {

        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        ItemNode temp = head;

        System.out.println("\n===== Inventory =====");

        while (temp != null) {

            displayItem(temp);

            temp = temp.next;
        }
    }

    // ------------------------------------------------
    // MERGE SORT
    // ------------------------------------------------

    // Sort by Item Name
    void sortByName(boolean ascending) {

        head = mergeSort(head, ascending, true);

        System.out.println("Inventory sorted by name.");
    }

    // Sort by Price
    void sortByPrice(boolean ascending) {

        head = mergeSort(head, ascending, false);

        System.out.println("Inventory sorted by price.");
    }

    // Merge Sort
    ItemNode mergeSort(ItemNode head,
                       boolean ascending,
                       boolean sortByName) {

        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        ItemNode slow = head;
        ItemNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ItemNode second = slow.next;
        slow.next = null;

        // Sort both halves
        ItemNode left =
                mergeSort(head, ascending, sortByName);

        ItemNode right =
                mergeSort(second, ascending, sortByName);

        // Merge
        return merge(left, right, ascending, sortByName);
    }

    // Merge two sorted lists
    ItemNode merge(ItemNode left,
                   ItemNode right,
                   boolean ascending,
                   boolean sortByName) {

        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        boolean takeLeft;

        if (sortByName) {

            int comparison =
                    left.itemName.compareToIgnoreCase(right.itemName);

            if (ascending) {
                takeLeft = comparison <= 0;
            } else {
                takeLeft = comparison >= 0;
            }

        } else {

            if (ascending) {
                takeLeft = left.price <= right.price;
            } else {
                takeLeft = left.price >= right.price;
            }
        }

        if (takeLeft) {

            left.next =
                    merge(left.next, right, ascending, sortByName);

            return left;

        } else {

            right.next =
                    merge(left, right.next, ascending, sortByName);

            return right;
        }
    }

    // Display one item
    void displayItem(ItemNode item) {

        System.out.println("-------------------------");
        System.out.println("Item Name: " + item.itemName);
        System.out.println("Item ID: " + item.itemId);
        System.out.println("Quantity: " + item.quantity);
        System.out.println("Price: " + item.price);
        System.out.println("Value: " +
                (item.price * item.quantity));
    }
}

public class InventoryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        int choice;

        do {

            System.out.println("\n===== Inventory Management =====");
            System.out.println("1. Add item at beginning");
            System.out.println("2. Add item at end");
            System.out.println("3. Add item at position");
            System.out.println("4. Delete item by ID");
            System.out.println("5. Update quantity");
            System.out.println("6. Search by ID");
            System.out.println("7. Search by name");
            System.out.println("8. Display inventory");
            System.out.println("9. Total inventory value");
            System.out.println("10. Sort by name");
            System.out.println("11. Sort by price");
            System.out.println("12. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter item name: ");
                    String name1 = sc.nextLine();

                    System.out.print("Enter item ID: ");
                    int id1 = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int quantity1 = sc.nextInt();

                    System.out.print("Enter price: ");
                    double price1 = sc.nextDouble();

                    inventory.insertAtBeginning(
                            name1, id1, quantity1, price1
                    );

                    break;

                case 2:

                    System.out.print("Enter item name: ");
                    String name2 = sc.nextLine();

                    System.out.print("Enter item ID: ");
                    int id2 = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int quantity2 = sc.nextInt();

                    System.out.print("Enter price: ");
                    double price2 = sc.nextDouble();

                    inventory.insertAtEnd(
                            name2, id2, quantity2, price2
                    );

                    break;

                case 3:

                    System.out.print("Enter item name: ");
                    String name3 = sc.nextLine();

                    System.out.print("Enter item ID: ");
                    int id3 = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int quantity3 = sc.nextInt();

                    System.out.print("Enter price: ");
                    double price3 = sc.nextDouble();

                    System.out.print("Enter position: ");
                    int position = sc.nextInt();

                    inventory.insertAtPosition(
                            name3, id3, quantity3,
                            price3, position
                    );

                    break;

                case 4:

                    System.out.print("Enter Item ID: ");
                    int deleteId = sc.nextInt();

                    inventory.deleteById(deleteId);

                    break;

                case 5:

                    System.out.print("Enter Item ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter new quantity: ");
                    int newQuantity = sc.nextInt();

                    inventory.updateQuantity(
                            updateId, newQuantity
                    );

                    break;

                case 6:

                    System.out.print("Enter Item ID: ");
                    int searchId = sc.nextInt();

                    inventory.searchById(searchId);

                    break;

                case 7:

                    System.out.print("Enter Item Name: ");
                    String searchName = sc.nextLine();

                    inventory.searchByName(searchName);

                    break;

                case 8:

                    inventory.display();

                    break;

                case 9:

                    inventory.calculateTotalValue();

                    break;

                case 10:

                    System.out.print(
                            "1. Ascending  2. Descending: "
                    );

                    int nameOrder = sc.nextInt();

                    inventory.sortByName(nameOrder == 1);

                    break;

                case 11:

                    System.out.print(
                            "1. Ascending  2. Descending: "
                    );

                    int priceOrder = sc.nextInt();

                    inventory.sortByPrice(priceOrder == 1);

                    break;

                case 12:

                    System.out.println("Program ended.");

                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 12);

        sc.close();
    }
}