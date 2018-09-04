package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class TransposeMatrixTest {
    TransposeMatrix s = new TransposeMatrix();
    @Test
    public void test1(){
        int[][] mtx = new int[][]{
            {1,2,3},{4,5,6},{7,8,9}
        };
        int[][] out = s.transpose(mtx);
        assertEquals("[1, 4, 7]", Arrays.toString(out[0]));
        assertEquals("[2, 5, 8]", Arrays.toString(out[1]));
        assertEquals("[3, 6, 9]", Arrays.toString(out[2]));
    }
    @Test
    public void test2(){
        int[][] mtx = new int[][]{
            {1,2,3},{4,5,6}
        };
        int[][] out = s.transpose(mtx);
        assertEquals("[1, 4]", Arrays.toString(out[0]));
        assertEquals("[2, 5]", Arrays.toString(out[1]));
        assertEquals("[3, 6]", Arrays.toString(out[2]));
    }
}
