package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WordSearchTest {
    WordSearch s = new WordSearch();
    @Test
    public void test1(){
        char[][] board = new char[][]{
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        assertTrue(s.exist(board, "ABCCED"));
        assertTrue(s.exist(board, "SEE"));
        assertFalse(s.exist(board, "ABCB"));
    }
    @Test
    public void test2(){
        char[][] board = new char[][]{
            {'A','B','C','E'},
            {'S','F','E','S'},
            {'A','D','E','E'}
        };
        assertTrue(s.exist(board, "ABCESEEEFS"));
    }
}
