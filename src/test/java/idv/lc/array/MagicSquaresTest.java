package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MagicSquaresTest {
    MagicSquares s = new MagicSquares();
    @Test
    public void test1(){
        int[][] arr = new int[][]{
            {4,3,8,4},
            {9,5,1,9},
            {2,7,6,2}
        };
        assertEquals(1, s.numMagicSquaresInside(arr));
    }
    @Test
    public void test2(){
        int[][] arr = new int[][]{
            {10, 3, 5},
            {1, 6, 11},
            {7, 9, 2}
        };
        assertEquals(0, s.numMagicSquaresInside(arr));
    }
    @Test
    public void test3(){
        int[][] arr = new int[][]{
            {3,2,9,2,7},
            {6,1,8,4,2},
            {7,5,3,2,7},
            {2,9,4,9,6},
            {4,3,8,2,5}
        };
        assertEquals(1, s.numMagicSquaresInside(arr));
    }
}
