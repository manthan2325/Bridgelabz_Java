
public class CustomHashMap {

    static class Node {
        int key;
        String value;
        Node next;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;
    private int capacity;

    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        buckets = new Node[capacity];
    }

    // Calculate the bucket index
    private int hash(int key) {
        return Math.floorMod(key, capacity);
    }

    // Insert a key-value pair or update an existing key
    public void put(int key, String value) {
        int index = hash(key);
        Node current = buckets[index];

        // Update value if key already exists
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Insert new node at the beginning of the list
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // Retrieve a value using its key
    public String get(int key) {
        int index = hash(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        return null; // Key not found
    }

    // Delete a key-value pair
    public void remove(int key) {
        int index = hash(key);
        Node current = buckets[index];
        Node previous = null;

        while (current != null) {
            if (current.key == key) {
                if (previous == null) {
                    // Removing the first node
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                return;
            }

            previous = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap(10);

        map.put(1, "Apple");
        map.put(11, "Mango"); // Collision with key 1
        map.put(2, "Banana");

        System.out.println(map.get(1));  // Apple
        System.out.println(map.get(11)); // Mango

        map.put(1, "Orange"); // Update existing key
        System.out.println(map.get(1));  // Orange

        map.remove(11);
        System.out.println(map.get(11)); // null
    }
}