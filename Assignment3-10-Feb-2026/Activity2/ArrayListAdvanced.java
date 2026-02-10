import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAdvanced {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Store 10 numbers
        for (int i = 1; i <= 10; i++) {
            list.add(i * 3);
        }

        // Remove all even numbers
        list.removeIf(n -> n % 2 == 0);

        // Find max and min
        int max = Collections.max(list);
        int min = Collections.min(list);

        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());

        // Display result
        System.out.println("Final List: " + list);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
