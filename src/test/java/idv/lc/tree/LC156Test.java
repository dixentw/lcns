package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC156Test {
    LC156 s = new LC156();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.left.left = new TreeNode(4);
        ro.left.right = new TreeNode(5);
        TreeNode nr = s.upsideDownBinaryTree(ro);
        assertEquals(4, nr.val);
        assertEquals(5, nr.left.val);
        assertEquals(2, nr.right.val);
        assertEquals(3, nr.right.left.val);
        assertEquals(1, nr.right.right.val);
    }
}
