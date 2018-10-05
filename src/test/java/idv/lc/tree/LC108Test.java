package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC108Test {
    LC108 s = new LC108();
    @Test
    public void test1(){
        TreeNode ro = s.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        assertEquals(0, ro.val);
        assertEquals(-10, ro.left.val);
        assertEquals(-3, ro.left.right.val);
        assertEquals(5, ro.right.val);
        assertEquals(9, ro.right.right.val);
    }
}
