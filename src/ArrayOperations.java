public class ArrayOperations {


        public static double calculateAverage(int[] array, int start, int end) {
            if (array == null || start < 0 || end >= array.length || start > end) {
                throw new IllegalArgumentException("Invalid input parameters");
            }

            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += array[i];
            }

            return (double) sum / (end - start + 1);
        }
    }
