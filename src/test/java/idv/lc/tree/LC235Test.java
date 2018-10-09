package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC235Test {
    LC235 s = new LC235();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(6);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(8);
        ro.left.left = new TreeNode(0);
        ro.left.right = new TreeNode(4);
        ro.left.right.left = new TreeNode(3);
        ro.left.right.right = new TreeNode(5);
        ro.right.left = new TreeNode(7);
        ro.right.right = new TreeNode(9);
        assertEquals(6, s.lowestCommonAncestor(ro, ro.left, ro.right).val);
    }
}
