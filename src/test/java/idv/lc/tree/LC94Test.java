package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC94Test {
    LC94 s = new LC94();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.right = new TreeNode(2);
        ro.right.left = new TreeNode(3);
        List<Integer> res = s.inorderTraversal(ro);
        assertEquals("[1, 3, 2]", Arrays.toString(res.toArray()));
    }
}
