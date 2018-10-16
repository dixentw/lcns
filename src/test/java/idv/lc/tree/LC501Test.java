package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC501Test {
    LC501 s = new LC501();
    @Test
    public void test1(){
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(2);
        int[] res = s.findMode(node);
        assertEquals(2, res[0]);
    }
    @Test
    public void test2(){
        TreeNode node = new TreeNode(2147483647);
        int[] res = s.findMode(node);
        assertEquals(2147483647, res[0]);
    }
}
