package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC101Test {
    LC101 s = new LC101();
    @Test
    public void test1(){
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(2);
        t.left.left = new TreeNode(3);
        t.left.right = new TreeNode(4);
        t.right.left= new TreeNode(4);
        t.right.right = new TreeNode(3);
        assertTrue(s.isSymmetric(t));
    }
}
