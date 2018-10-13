package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC333Test {
    LC333 s = new LC333();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(10);
        ro.left = new TreeNode(5);
        ro.right = new TreeNode(15);
        ro.left.left = new TreeNode(1);
        ro.left.right = new TreeNode(8);
        ro.right.right = new TreeNode(7);
        assertEquals(3, s.largestBSTSubtree(ro));
    }
}
