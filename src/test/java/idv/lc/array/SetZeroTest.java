package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class SetZeroTest {
    SetZero s = new SetZero();
    @Test
    public void test1(){
        int[][] arr = new int[][]{
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        s.setZeroes(arr);
        assertEquals("[1, 0, 1]", Arrays.toString(arr[0]));
        assertEquals("[0, 0, 0]", Arrays.toString(arr[1]));
        assertEquals("[1, 0, 1]", Arrays.toString(arr[2]));
    }
    @Test
    public void test2(){
        int[][] arr = new int[][]{
            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };
        s.setZeroes(arr);
        assertEquals("[0, 0, 0, 0]", Arrays.toString(arr[0]));
        assertEquals("[0, 4, 5, 0]", Arrays.toString(arr[1]));
        assertEquals("[0, 3, 1, 0]", Arrays.toString(arr[2]));
    }
}
