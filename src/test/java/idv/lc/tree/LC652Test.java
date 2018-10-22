package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC652Test {
    LC652 s = new LC652();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.left.left = new TreeNode(4);
        ro.right.left = new TreeNode(2);
        ro.right.right = new TreeNode(4);
        ro.right.left.left = new TreeNode(4);
        List<TreeNode> res = s.findDuplicateSubtrees(ro);
        assertEquals(4, res.get(0).val);
        assertEquals(2, res.get(1).val);

    }
}
