package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC426Test {
    LC426 s = new LC426();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(4);
        ro.left = new TreeNode(2);
        ro.left.left = new TreeNode(1);
        ro.left.right = new TreeNode(3);
        ro.right = new TreeNode(5);
        TreeNode tr = s.treeToDoublyList(ro);
        assertEquals(1, tr.val);
        assertEquals(2, tr.right.val);
        assertEquals(3, tr.right.right.val);
        assertEquals(4, tr.right.right.right.val);
        assertEquals(5, tr.right.right.right.right.val);
        assertEquals(1, tr.right.right.right.right.right.val);
    }
}
