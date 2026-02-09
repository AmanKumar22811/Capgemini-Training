import java.util.*;

class Marks {
    int marks1, marks2, marks3;

    public Marks(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
}

public class BubbleSortThreeParameter {

    public static void main(String[] args) {

        List<Marks> list = new ArrayList<>();

        list.add(new Marks(10, 20, 50));
        list.add(new Marks(50, 20, 50));
        list.add(new Marks(10, 30, 50));
        list.add(new Marks(10, 20, 60));
        list.add(new Marks(10, 100, 50));
        list.add(new Marks(10, 20, 50));
        list.add(new Marks(10, 20, 80));

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {

                Marks a = list.get(j);
                Marks b = list.get(j + 1);

                if (a.marks1 > b.marks1 ||
                   (a.marks1 == b.marks1 && a.marks2 > b.marks2) ||
                   (a.marks1 == b.marks1 && a.marks2 == b.marks2 && a.marks3 > b.marks3)) {

                    list.set(j, b);
                    list.set(j + 1, a);
                }
            }
        }

        for (Marks m : list) {
            System.out.println(m.marks1 + " " + m.marks2 + " " + m.marks3);
        }
    }
}
