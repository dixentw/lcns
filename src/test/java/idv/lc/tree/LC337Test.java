package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC337Test {
    LC337 s = new LC337();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(3);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.left.right = new TreeNode(3);
        ro.right.right = new TreeNode(1);
        assertEquals(7, s.rob(ro));
    }
}
