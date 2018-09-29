package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ShortestWordDistance3Test {
    ShortestWordDistance3 s = new ShortestWordDistance3();
    @Test
    public void test1(){
        int res = s.shortestWordDistance(new String[]{
            "practice", "makes", "perfect", "coding", "makes"
        }, "makes", "coding");
        assertEquals(1, res);
        res = s.shortestWordDistance(new String[]{
            "practice", "makes", "perfect", "coding", "makes"
        }, "makes", "makes");
        assertEquals(3, res);

    }
}
