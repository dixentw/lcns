package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC897Test {
    LC897 s = new LC897();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(5);
        ro.left = new TreeNode(3);
        ro.right = new TreeNode(6);
        ro.left.left = new TreeNode(2);
        ro.left.right = new TreeNode(4);
        ro.left.left.left = new TreeNode(1);
        ro.right.right = new TreeNode(8);
        ro.right.right.left = new TreeNode(7);
        ro.right.right.right = new TreeNode(9);
        TreeNode n = s.increasingBST(ro);
        int i=1;
        while (n!=null) {
            assertEquals(i, n.val);
            n = n.right;
            i++;
        }
    }
}
