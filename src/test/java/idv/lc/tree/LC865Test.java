package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC865Test {
    LC865 s = new LC865();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(3);
        ro.left = new TreeNode(5);
        ro.right = new TreeNode(1);
        ro.left.left = new TreeNode(6);
        ro.left.right = new TreeNode(2);
        ro.left.right.left = new TreeNode(7);
        ro.left.right.right = new TreeNode(4);
        ro.right.left = new TreeNode(0);
        ro.right.right  = new TreeNode(8);
        TreeNode res = s.subtreeWithAllDeepest(ro);
        assertEquals(2,res.val);
    }
}
