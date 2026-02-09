public class InsertionSortOnNAryMarks {

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

        for (int i = 1; i < n; i++) {

            int[] key = arr[i];
            int j = i - 1;

            while (j >= 0 && check(key, arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
