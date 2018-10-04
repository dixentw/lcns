package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC102Test {
    LC102 s = new LC102();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(3);
        ro.left = new TreeNode(9);
        ro.right = new TreeNode(20);
        ro.right.left = new TreeNode(15);
        ro.right.right = new TreeNode(7);
        List<List<Integer>> res = s.levelOrder(ro);
        assertEquals("[3]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[9, 20]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[15, 7]", Arrays.toString(res.get(2).toArray()));
    }
}
