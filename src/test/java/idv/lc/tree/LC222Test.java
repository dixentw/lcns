package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC222Test {
    LC222 s = new LC222();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.left.left = new TreeNode(4);
        ro.left.right = new TreeNode(5);
        ro.right.left = new TreeNode(6);
        assertEquals(6, s.countNodes(ro));
    }
}
