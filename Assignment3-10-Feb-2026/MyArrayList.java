public class MyArrayList<T extends Comparable<T>> {
    private int size;
    private Object[] data;

    // Constructor
    MyArrayList() {
        data = new Object[4];
        size = 0;
    }

    // Add element
    public void add(T val) {
        if (size == data.length) {
            resize();
        }
        data[size++] = val;
    }

    // Resize array
    private void resize() {
        Object[] newData = new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    // Print elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Get element (0-based index)
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (T) data[index];
    }

    // Remove element (0-based index)
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        
        data[--size] = null;
    }

    // Search element
    public int search(T val) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    // Sort (Bubble Sort)
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                T a = (T) data[j];
                T b = (T) data[j + 1];

                if (a.compareTo(b) > 0) {
                    data[j] = b;
                    data[j + 1] = a;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(50);
        list.add(10);
        list.add(100);
        list.add(50);
        list.add(70);

        list.print();        
        System.out.println(list.get(2));

        list.remove(1);
        list.print();         

        System.out.println(list.search(100));

        list.sort();
        list.print();         

        MyArrayList<String> names = new MyArrayList<>();
        names.add("Abc");
        names.add("Pqr");
        names.add("Xyz");

        names.sort();
        names.print();      
    }
}
