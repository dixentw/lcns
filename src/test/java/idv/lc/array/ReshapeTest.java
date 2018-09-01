package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ReshapeTest {
    Reshape s = new Reshape();
    @Test
    public void test1(){
        int[][] nums = new int[][] {
            {1,2},
            {3,4}
        };
        int[][] res = s.matrixReshape(nums, 1, 4);
        assertEquals("[1, 2, 3, 4]", Arrays.toString(res[0]));
    }
    @Test
    public void test2(){
        int[][] nums = new int[][] {
            {1,2},
            {3,4}
        };
        int[][] res = s.matrixReshape(nums, 4, 1);
        assertEquals("[1]", Arrays.toString(res[0]));
    }
}
