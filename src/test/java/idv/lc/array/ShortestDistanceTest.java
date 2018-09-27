package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ShortestDistanceTest {
    ShortestDistance s = new ShortestDistance();
    @Test
    public void test1(){
        int res = s.shortestDistance(
            new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice");
        assertEquals(3, res);
    }
    @Test
    public void test2(){
        int res = s.shortestDistance(
            new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding");
        assertEquals(1, res);
    }
}
