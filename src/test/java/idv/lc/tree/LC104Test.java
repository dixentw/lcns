package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC104Test {
    LC104 s = new LC104();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(3);
        ro.left = new TreeNode(9);
        ro.right = new TreeNode(20);
        ro.right.left = new TreeNode(15);
        ro.right.right = new TreeNode(7);
        assertEquals(3, s.maxDepth(ro));
    }
}
