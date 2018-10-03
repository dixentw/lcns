package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC96Test {
    LC96 s = new LC96();
    @Test
    public void test1(){
        assertEquals(5, s.numTrees(3));
    }
}
