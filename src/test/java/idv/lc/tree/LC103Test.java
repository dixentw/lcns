package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC103Test {
    LC103 s = new LC103();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(3);
        ro.left = new TreeNode(9);
        ro.right = new TreeNode(20);
        ro.right.left = new TreeNode(15);
        ro.right.right = new TreeNode(7);
        List<List<Integer>> res = s.zigzagLevelOrder(ro);
        assertEquals("[3]", Arrays.toString(res.get(0).toArray()));
        assertEquals("[20, 9]", Arrays.toString(res.get(1).toArray()));
        assertEquals("[15, 7]", Arrays.toString(res.get(2).toArray()));
    }
}
