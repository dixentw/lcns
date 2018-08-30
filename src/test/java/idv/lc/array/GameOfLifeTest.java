package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class GameOfLifeTest {
    GameOfLife s = new GameOfLife();
    @Test
    public void test1(){
        int[][] input = new int[][]{
            {0,1,0},
            {0,0,1},
            {1,1,1},
            {0,0,0}
        };
        s.gameOfLife(input);
        assertEquals("[0, 0, 0]", Arrays.toString(input[0]));
        assertEquals("[1, 0, 1]", Arrays.toString(input[1]));
        assertEquals("[0, 1, 1]", Arrays.toString(input[2]));
        assertEquals("[0, 1, 0]", Arrays.toString(input[3]));
    }
}
