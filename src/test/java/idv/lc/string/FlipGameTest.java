package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FlipGameTest {
    FlipGame s = new FlipGame();
    @Test
    public void test1(){
        List<String> res = s.generatePossibleNextMoves("++++");
        assertEquals(3, res.size());
        assertEquals("--++", res.get(0));
        assertEquals("+--+", res.get(1));
        assertEquals("++--", res.get(2));
    }
}
