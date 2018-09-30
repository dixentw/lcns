package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindBlackPixelTest {
    FindBlackPixel s = new FindBlackPixel();
    @Test
    public void test1(){
        char[][] pic = new char[][]{
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'B', 'W'},
            {'W', 'W', 'B', 'W', 'B', 'W'}
        };
        assertEquals(6, s.findBlackPixel(pic, 3));
    }

    @Test
    public void test2(){
        char[][] pic = new char[][]{
            {'W','B','W','B','B','W'},
            {'B','W','B','W','W','B'},
            {'W','B','W','B','B','W'},
            {'B','W','B','W','W','B'},
            {'W','W','W','B','B','W'},
            {'B','W','B','W','W','B'}
        };
        assertEquals(9, s.findBlackPixel(pic, 3));
    }

}
