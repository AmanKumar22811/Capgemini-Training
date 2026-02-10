import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Add 5 customers
        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");
        queue.add("Customer 4");
        queue.add("Customer 5");

        // Remove 2 customers
        queue.poll();
        queue.poll();

        // Display remaining queue
        System.out.println("Remaining Queue: " + queue);
    }
}
