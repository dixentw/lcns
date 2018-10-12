package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC297Test {
    LC297 s = new LC297();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.right.left = new TreeNode(4);
        ro.right.right = new TreeNode(5);
        assertEquals("[1,2,3,null,null,4,5]", s.serialize(ro));
    }
    @Test
    public void test2(){
        TreeNode ro = s.deserialize("[1,2,3,null,null,4,5]");
        assertEquals(1, ro.val);
        assertEquals(2, ro.left.val);
        assertEquals(3, ro.right.val);
        assertEquals(null, ro.left.left);
        assertEquals(null, ro.left.right);
        assertEquals(4, ro.right.left.val);
        assertEquals(5, ro.right.right.val);
    }
}
