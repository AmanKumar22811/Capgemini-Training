import java.util.ArrayList;

public class StudentMarks {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        // Add 5 student marks
        marks.add(78);
        marks.add(85);
        marks.add(67);
        marks.add(90);
        marks.add(72);

        // Insert a mark at index 2
        marks.add(2, 80);

        // Find and remove the lowest mark
        int min = marks.get(0);
        for (int m : marks) {
            if (m < min) {
                min = m;
            }
        }
        marks.remove(Integer.valueOf(min));

        // Display final list
        System.out.println("Final Marks List: " + marks);
    }
}
