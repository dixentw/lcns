package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC298Test {
    LC298 s = new LC298();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.right = new TreeNode(3);
        ro.right.left = new TreeNode(2);
        ro.right.right = new TreeNode(4);
        ro.right.right.right = new TreeNode(5);
        assertEquals(3, s.longestConsecutive(ro));
    }
    @Test
    public void test2(){
        TreeNode ro = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.right.left = new TreeNode(2);
        ro.right.left.left = new TreeNode(1);
        assertEquals(2, s.longestConsecutive(ro));
    }
    @Test
    public void test3(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.left.left = new TreeNode(4);
        ro.left.right = new TreeNode(5);
        assertEquals(2, s.longestConsecutive(ro));
    }
}
