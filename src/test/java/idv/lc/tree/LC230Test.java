package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC230Test {
    LC230 s = new LC230();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(3);
        ro.left = new TreeNode(1);
        ro.left.right = new TreeNode(2);
        ro.right = new TreeNode(4);
        assertEquals(1, s.kthSmallest(ro, 1));
    }
    @Test
    public void test2(){
        TreeNode ro = new TreeNode(5);
        ro.left = new TreeNode(3);
        ro.left.left = new TreeNode(2);
        ro.left.left.left = new TreeNode(1);
        ro.left.right = new TreeNode(4);
        ro.right = new TreeNode(6);
        assertEquals(3, s.kthSmallest(ro, 3));
    }
}
