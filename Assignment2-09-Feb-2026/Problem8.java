
public class SelectionSort {

    static boolean check(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) return true;
            if (a[i] > b[i]) return false;
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {50, 50, 60, 40},
            {20, 40, 80, 10},
            {60, 10, 50, 70},
            {20, 40, 80, 50}
        };

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = i;

            for (int j = i + 1; j < n; j++) {
                if (check(arr[max], arr[j])) {
                    max = j;
                }
            }

            int[] temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
