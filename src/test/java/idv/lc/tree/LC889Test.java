package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC889Test {
    LC889 s = new LC889();
    @Test
    public void test1(){
        int[] pre = new int[]{1,2,4,5,3,6,7};
        int[] post = new int[]{4,5,2,6,7,3,1};
        TreeNode root = s.constructFromPrePost(pre, post);
        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertEquals(3, root.right.val);
        assertEquals(4, root.left.left.val);
        assertEquals(5, root.left.right.val);
        assertEquals(6, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }
}
