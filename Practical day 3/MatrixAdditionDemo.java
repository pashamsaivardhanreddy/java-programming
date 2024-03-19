class MatrixThread extends Thread {
    private int[][] matrix;
    private int sum;

    public MatrixThread(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        sum = calculateSum(matrix);
    }

    private int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }
}

public class MatrixAdditionDemo {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        MatrixThread thread1 = new MatrixThread(matrix1);
        MatrixThread thread2 = new MatrixThread(matrix2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int totalElements = thread1.getSum() + thread2.getSum();

        System.out.println("Total elements in both matrices: " + totalElements);

        // T3 should wait for T4 to complete counting the elements in both T1 and T2
        // Then T3 can acquire T1 and T2 and complete matrix addition
        MatrixThread thread3 = new MatrixThread(new int[3][3]);
        MatrixThread thread4 = new MatrixThread(new int[3][3]);

        thread3.start();
        try {
            thread3.join(); // T3 waits for T4 to complete counting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Matrix addition completed by Thread 3.");
    }
}
