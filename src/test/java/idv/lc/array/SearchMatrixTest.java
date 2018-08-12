package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SearchMatrixTest {
    SearchMatrix s = new SearchMatrix();
    @Test
    public void test1(){
        int[][] ma = new int[][]{
            {1,   3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        assertTrue(s.searchMatrix(ma, 3));
        assertFalse(s.searchMatrix(ma, 13));
    }
}
