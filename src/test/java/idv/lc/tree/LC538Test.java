package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC538Test {
    LC538 s = new LC538();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(5);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(13);
        s.convertBST(ro);
        assertEquals(18, ro.val);
        assertEquals(20, ro.left.val);
        assertEquals(13, ro.right.val);
    }
}
