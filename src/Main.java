public class Main {


        public static boolean isSquareMatrix(int[][] matrix) {
            if (matrix == null || matrix.length == 0) {
                return false;
            }

            int rows = matrix.length;
            int cols = matrix[0].length;

            if (rows != cols) {
                return false;
            }

            for (int[] row : matrix) {
                if (row.length != cols) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            double avg = ArrayOperations.calculateAverage(array, 1, 3);
            System.out.println("Average: " + avg);

            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            boolean isSquare = isSquareMatrix(matrix);
            System.out.println("Is square matrix? " + isSquare);
        }
    }
