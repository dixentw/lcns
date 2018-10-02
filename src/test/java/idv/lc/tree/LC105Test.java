package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC105Test {
    LC105 s = new LC105();
    @Test
    public void test1(){
        TreeNode root = s.buildTree(
            new int[]{3,9,20,15,7},
            new int[]{9,3,15,20,7}
        );
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);
        assertEquals(15, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }
}
