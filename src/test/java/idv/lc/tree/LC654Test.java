package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC654Test {
    LC654 s = new LC654();
    @Test
    public void test1(){
        int[] arr = new int[]{3,2,1,6,0,5};
        TreeNode root = s.constructMaximumBinaryTree(arr);
        assertEquals(6, root.val);
        assertEquals(3, root.left.val);
        assertEquals(5, root.right.val);
        assertEquals(2, root.left.right.val);
        assertEquals(0, root.right.left.val);
        assertEquals(1, root.left.right.right.val);
    }
}
