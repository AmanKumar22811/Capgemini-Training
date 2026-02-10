import java.util.LinkedList;

public class HospitalQueue {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        // Add 5 patients
        queue.add("Patient A");
        queue.add("Patient B");
        queue.add("Patient C");
        queue.add("Patient D");
        queue.add("Patient E");

        // Emergency patient at first position
        queue.addFirst("Emergency Patient");

        // Remove 2 patients after treatment
        queue.removeFirst();
        queue.removeFirst();

        // Display current queue
        System.out.println("Current Hospital Queue:");
        System.out.println(queue);
    }
}
