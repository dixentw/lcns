package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC144Test {
    LC144 s = new LC144();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.right = new TreeNode(2);
        ro.right.left = new TreeNode(3);
        List<Integer> res = s.preorderTraversal(ro);
        assertEquals("[1, 2, 3]", Arrays.toString(res.toArray()));
    }
}
