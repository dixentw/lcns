package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC669Test {
    LC669 s = new LC669();
    @Test
    public void test1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(2);
        TreeNode res = s.trimBST(root, 1, 2);
        assertEquals(1, root.val);
        assertEquals(2, root.right.val);
        assertNull(root.left);
    }
}
