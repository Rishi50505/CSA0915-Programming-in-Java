public class Main {
    public static void main(String[] args) {
        int rows = 9;
        int cols = 9;

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = i * cols + j + 1;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = (rows - i) * cols - j;
            }
        }

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}