package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC114Test {
    LC114 s = new LC114();
    LC536 p = new LC536();
    @Test
    public void test1(){
        String tr = "1(2(3)(4))(5(6))";
        TreeNode ro = p.str2tree(tr);
        s.flatten(ro);
        assertEquals(1, ro.val);
        assertEquals(2, ro.right.val);
        assertEquals(3, ro.right.right.val);
        assertEquals(4, ro.right.right.right.val);
        assertEquals(5, ro.right.right.right.right.val);
        assertEquals(6, ro.right.right.right.right.right.val);
    }
}
