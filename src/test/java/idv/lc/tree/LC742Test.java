package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC742Test {
    LC742 s = new LC742();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(3);
        ro.right = new TreeNode(2);
        assertEquals(3, s.findClosestLeaf(ro, 1));
    }
}
