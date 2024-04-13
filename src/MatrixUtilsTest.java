import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixUtilsTest {
    @Test
    public void testIsSquareMatrix() {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};

        assertTrue(MatrixUtils.isSquareMatrix(squareMatrix));
        assertFalse(MatrixUtils.isSquareMatrix(nonSquareMatrix));
    }
}
