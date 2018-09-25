package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ScoreOfParenthesesTest {
    ScoreOfParentheses s = new ScoreOfParentheses();
    @Test
    public void test1(){
        assertEquals(1, s.scoreOfParentheses("()"));
        assertEquals(2, s.scoreOfParentheses("()()"));
        assertEquals(2, s.scoreOfParentheses("(())"));
        assertEquals(6, s.scoreOfParentheses("(()(()))"));
    }
}
