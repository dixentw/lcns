package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC617Test {
    LC617 s = new LC617();
    @Test
    public void test1(){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right= new TreeNode(3);
        t2.left.right= new TreeNode(4);
        t2.right.right= new TreeNode(7);

        TreeNode ro = s.mergeTrees(t1, t2);
        assertEquals(3, ro.val);
        assertEquals(4, ro.left.val);
        assertEquals(5, ro.right.val);
        assertEquals(5, ro.left.left.val);
        assertEquals(4, ro.left.right.val);
        assertEquals(7, ro.right.right.val);

    }
}
