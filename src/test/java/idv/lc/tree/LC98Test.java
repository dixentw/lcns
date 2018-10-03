package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC98Test {
    LC98 s = new LC98();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(2);
        ro.left = new TreeNode(1);
        ro.right = new TreeNode(3);
        assertTrue(s.isValidBST(ro));
    }
    @Test
    public void test2(){
        TreeNode ro = new TreeNode(5);
        ro.left = new TreeNode(1);
        ro.right = new TreeNode(4);
        ro.right.left = new TreeNode(3);
        ro.right.right = new TreeNode(6);
        assertFalse(s.isValidBST(ro));
    }
}
