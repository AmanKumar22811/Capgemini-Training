import java.util.*;

class BubbleObj {
    int rollNo;
    String name;

    public BubbleObj(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class InsertionSortOnObject {

    public static void main(String[] args) {

        List<BubbleObj> list = new ArrayList<>();
        list.add(new BubbleObj(11, "A"));
        list.add(new BubbleObj(10, "B"));
        list.add(new BubbleObj(5, "D"));
        list.add(new BubbleObj(5, "C"));
        list.add(new BubbleObj(15, "F"));
        list.add(new BubbleObj(15, "E"));

        for (int i = 1; i < list.size(); i++) {

            BubbleObj key = list.get(i);
            int j = i - 1;

            while (j >= 0 &&
                  (list.get(j).rollNo > key.rollNo ||
                  (list.get(j).rollNo == key.rollNo &&
                   list.get(j).name.compareTo(key.name) > 0))) {

                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);
        }

        for (BubbleObj obj : list) {
            System.out.println(obj.rollNo + " " + obj.name);
        }
    }
}
