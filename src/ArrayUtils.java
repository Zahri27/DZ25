public class ArrayUtils {
    public static double calculateAverage(int[] array, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid start or end index");
        }

        int sum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            sum += array[i];
        }

        return (double) sum / (endIndex - startIndex + 1);
    }
}
