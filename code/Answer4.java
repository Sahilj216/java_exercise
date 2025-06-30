public class Answer4 {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 4},
            {5, 4, 2},
            {10, 3, 5}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // Column sum
        for (int i = 0; i < cols; i++) {
            int colSum = 0;
            for (int[] ints : arr) {
                colSum += ints[i];
            }
            System.out.println("Sum of column " + (i + 1) + ": " + colSum);
        }

        // Row sum
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
    }
}

