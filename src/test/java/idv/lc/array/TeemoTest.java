package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class TeemoTest {
    Teemo s = new Teemo();
    @Test
    public void test1(){
        int res = s.findPoisonedDuration(new int[]{1, 4}, 2);
        assertEquals(res, 4);
        res = s.findPoisonedDuration(new int[]{1, 2}, 2);
        assertEquals(res, 3);
    }
}
