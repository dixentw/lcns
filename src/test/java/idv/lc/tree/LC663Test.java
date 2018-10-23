package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC663Test {
    LC663 s = new LC663();
    @Test
    public void test1(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertTrue(s.checkEqualTree(root));
    }
}
