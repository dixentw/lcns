package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RotateImageTest {
    RotateImage s = new RotateImage();
    @Test
    public void test1(){
        int[][] matrix = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        s.rotate(matrix);
        assertEquals("[7, 4, 1]", Arrays.toString(matrix[0]));
        assertEquals("[8, 5, 2]", Arrays.toString(matrix[1]));
        assertEquals("[9, 6, 3]", Arrays.toString(matrix[2]));
    }
}
