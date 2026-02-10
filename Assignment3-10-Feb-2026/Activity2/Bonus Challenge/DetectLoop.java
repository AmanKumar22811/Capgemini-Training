public class DetectLoop {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Floyd’s Cycle Detection Algorithm
    static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop found
            }
        }
        return false; // No loop
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a loop: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        if (detectLoop(head))
            System.out.println("Loop detected in linked list");
        else
            System.out.println("No loop in linked list");
    }
}
