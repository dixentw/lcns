package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC863Test {
    LC863 s = new LC863();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(3);
        ro.left = new TreeNode(5);
        ro.right = new TreeNode(1);
        ro.left.left = new TreeNode(6);
        ro.left.right = new TreeNode(2);
        ro.left.right.left = new TreeNode(7);
        ro.left.right.right = new TreeNode(4);
        ro.right.left = new TreeNode(0);
        ro.right.right  = new TreeNode(8);
        List<Integer> res = s.distanceK(ro, ro.left, 2);
        assertEquals("[7, 4, 1]", Arrays.toString(res.toArray()));
    }
}
