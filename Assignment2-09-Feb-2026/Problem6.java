import java.util.*;

class SelectionObj {
    int rollNo;
    String name;

    public SelectionObj(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class SelectionSortOnObject {

    public static void main(String[] args) {

        List<SelectionObj> list = new ArrayList<>();
        list.add(new SelectionObj(11, "A"));
        list.add(new SelectionObj(10, "B"));
        list.add(new SelectionObj(5, "D"));
        list.add(new SelectionObj(5, "C"));
        list.add(new SelectionObj(15, "F"));
        list.add(new SelectionObj(15, "E"));

        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j).rollNo < list.get(minIndex).rollNo) {
                    minIndex = j;
                }
                else if (list.get(j).rollNo == list.get(minIndex).rollNo &&
                         list.get(j).name.compareTo(list.get(minIndex).name) < 0) {
                    minIndex = j;
                }
            }

            SelectionObj temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }

        for (SelectionObj obj : list) {
            System.out.println(obj.rollNo + " " + obj.name);
        }
    }
}
