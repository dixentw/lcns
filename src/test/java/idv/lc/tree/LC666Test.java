package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC666Test {
    LC666 s = new LC666();
    @Test
    public void test1(){
        assertEquals(12,s.pathSum(new int[]{113, 215, 221}));
    }
}
