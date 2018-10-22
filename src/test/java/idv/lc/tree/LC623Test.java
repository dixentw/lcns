package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC623Test {
    LC623 s = new LC623();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(4);
        ro.left = new TreeNode(2);
        ro.left.left = new TreeNode(3);
        ro.left.right = new TreeNode(1);

        TreeNode added = s.addOneRow(ro, 1, 3);
        assertEquals(4, added.val);
        assertEquals(2, added.left.val);
        assertEquals(1, added.left.left.val);
        assertEquals(1, added.left.right.val);
        assertEquals(3, added.left.left.left.val);
        assertEquals(1, added.left.right.right.val);
    }
}
