public class BubbleSortOnNAryMarks {

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
            for (int j = 0; j < n - i - 1; j++) {

                if (check(arr[j], arr[j + 1])) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
