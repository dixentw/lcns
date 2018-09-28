package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WordDistanceTest {
    @Test
    public void test1(){
        WordDistance s = new WordDistance(new String[]{
            "practice", "makes", "perfect", "coding", "makes"
        });
        assertEquals(3, s.shortest("coding", "practice"));
        assertEquals(1, s.shortest("coding", "makes"));
    }
}
