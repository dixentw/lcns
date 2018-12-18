package idv.lc.misc;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC771Test {
    LC771 s = new LC771();
    @Test
    public void test1(){
        assertEquals(3, s.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, s.numJewelsInStones("z", "ZZ"));
    }
}
