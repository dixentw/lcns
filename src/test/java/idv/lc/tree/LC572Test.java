package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC572Test {
    LC572 s = new LC572();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(3);
        ro.left = new TreeNode(4);
        ro.right = new TreeNode(5);
        ro.left.left = new TreeNode(1);
        ro.left.right = new TreeNode(2);
        assertTrue(s.isSubtree(ro, ro.left));
    }
}
