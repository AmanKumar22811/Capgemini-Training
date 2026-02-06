class MatrixOperations {
    static void transpose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        System.out.println("Transpose:");
        
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }

    static void rotate(int[][] mat) {
        System.out.println("2x2 Rotation (90° Clockwise):");

        for (int j = 0; j < 2; j++) {
            for (int i = 1; i >= 0; i--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] A, int[][] B) {
        int[][] result = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix Multiplication Result (3x4):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void flip(int[][] mat) {
        System.out.println("Matrix Flip : ");

        for (int i = 0; i < 4; i++) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        transpose(matrix);

        int[][] mat = {
                {1, 2},
                {3, 4}
        };

        rotate(mat);

        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] B = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        multiply(A, B);

        int[][] mat2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        flip(mat2);
    }
}
