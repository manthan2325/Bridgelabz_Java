class TextNode {

    String text;
    TextNode prev;
    TextNode next;

    TextNode(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}


class TextEditor {

    TextNode head;
    TextNode tail;
    TextNode current;

    int size = 0;
    final int MAX_HISTORY = 10;


    // 1. Add a new text state
    void addState(String text) {

        TextNode newNode = new TextNode(text);

        // First state
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
            size = 1;
            return;
        }

        // If we are in the middle because of undo,
        // remove all redo states.
        current.next = null;
        tail = current;

        // Connect new node
        newNode.prev = current;
        current.next = newNode;

        // Move current to new state
        current = newNode;
        tail = newNode;

        size++;

        // Limit history to 10 states
        if (size > MAX_HISTORY) {

            head = head.next;
            head.prev = null;

            size--;
        }
    }


    // 2. Undo
    void undo() {

        if (current == null) {
            System.out.println("No states available.");
            return;
        }

        if (current.prev == null) {
            System.out.println("Nothing to undo.");
            return;
        }

        current = current.prev;

        System.out.println("Undo performed.");
    }


    // 3. Redo
    void redo() {

        if (current == null) {
            System.out.println("No states available.");
            return;
        }

        if (current.next == null) {
            System.out.println("Nothing to redo.");
            return;
        }

        current = current.next;

        System.out.println("Redo performed.");
    }


    // 4. Display current state
    void displayCurrent() {

        if (current == null) {
            System.out.println("Text is empty.");
            return;
        }

        System.out.println("Current Text: " + current.text);
    }


    // Display entire history
    void displayHistory() {

        TextNode temp = head;

        System.out.println("\n===== History =====");

        while (temp != null) {

            if (temp == current) {
                System.out.println(
                    "[CURRENT] " + temp.text
                );
            } else {
                System.out.println(temp.text);
            }

            temp = temp.next;
        }
    }
}


public class UndoRedo {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addState("");
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");

        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.redo();
        editor.displayCurrent();

        editor.displayHistory();
    }
}