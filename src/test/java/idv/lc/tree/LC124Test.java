package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC124Test {
    LC124 s = new LC124();
    @Test
    public void test1(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(6, s.maxPathSum(root));
    }
}
