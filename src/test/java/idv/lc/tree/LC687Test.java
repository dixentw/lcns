package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC687Test {
    LC687 s = new LC687();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(5);
        ro.left = new TreeNode(4);
        ro.right = new TreeNode(5);
        ro.left.left = new TreeNode(1);
        ro.left.right=  new TreeNode(1);
        ro.right.right = new TreeNode(5);
        assertEquals(2, s.longestUnivaluePath(ro));
    }
    @Test
    public void test2(){
        TreeNode ro = new TreeNode(5);
        ro.left = new TreeNode(4);
        ro.right = new TreeNode(5);
        ro.left.left = new TreeNode(4);
        ro.left.right=  new TreeNode(4);
        ro.right.right = new TreeNode(5);
        assertEquals(2, s.longestUnivaluePath(ro));
    }
}
