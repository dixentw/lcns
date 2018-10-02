package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC536Test {
    LC536 s = new LC536();
    @Test
    public void test1(){
        TreeNode ro = s.str2tree("4(2(3)(1))(6(5))");
        assertEquals(4, ro.val);
        assertEquals(2, ro.left.val);
        assertEquals(3, ro.left.left.val);
        assertEquals(1, ro.left.right.val);
        assertEquals(6, ro.right.val);
        assertEquals(5, ro.right.left.val);
    }
}
