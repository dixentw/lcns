package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC285Test {
    LC285 s = new LC285();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(2);
        ro.left = new TreeNode(1);
        ro.right = new TreeNode(3);
        TreeNode res = s.inorderSuccessor(ro, ro.left);
        assertEquals(2, res.val);
        res = s.inorderSuccessor(ro, ro.right);
        assertTrue(res == null);
    }
}
