package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC250Test {
    LC250 s = new LC250();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(5);
        ro.left = new TreeNode(1);
        ro.right = new TreeNode(5);
        ro.left.left = new TreeNode(5);
        ro.left.right = new TreeNode(5);
        ro.right.right = new TreeNode(5);
        assertEquals(4, s.countUnivalSubtrees(ro));
    }
}
