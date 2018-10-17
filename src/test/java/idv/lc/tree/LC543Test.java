package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC543Test {
    LC543 s = new LC543();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        ro.left.left = new TreeNode(4);
        ro.left.right = new TreeNode(5);
        assertEquals(3, s.diameterOfBinaryTree(ro));
    }
}
