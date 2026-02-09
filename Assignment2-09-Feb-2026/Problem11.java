import java.util.*;

class Marks {
    int marks1, marks2, marks3;

    public Marks(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
}

public class InsertionSortThreeParameter {

    public static void main(String[] args) {

        List<Marks> list = new ArrayList<>();

        list.add(new Marks(10, 20, 50));
        list.add(new Marks(50, 20, 50));
        list.add(new Marks(10, 30, 50));
        list.add(new Marks(10, 20, 60));
        list.add(new Marks(10, 100, 50));
        list.add(new Marks(10, 20, 50));
        list.add(new Marks(10, 20, 80));

        for (int i = 1; i < list.size(); i++) {

            Marks key = list.get(i);
            int j = i - 1;

            while (j >= 0 &&
                  (list.get(j).marks1 > key.marks1 ||
                  (list.get(j).marks1 == key.marks1 &&
                   list.get(j).marks2 > key.marks2) ||
                  (list.get(j).marks1 == key.marks1 &&
                   list.get(j).marks2 == key.marks2 &&
                   list.get(j).marks3 > key.marks3))) {

                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);
        }

        for (Marks m : list) {
            System.out.println(m.marks1 + " " + m.marks2 + " " + m.marks3);
        }
    }
}
