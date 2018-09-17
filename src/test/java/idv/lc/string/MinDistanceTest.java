package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MinDistanceTest {
    MinDistance s = new MinDistance();
    @Test
    public void test1(){
        assertEquals(2, s.minDistance("sea", "eat"));
    }
}
