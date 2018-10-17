package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC545Test {
    LC545 s = new LC545();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.right = new TreeNode(2);
        ro.right.left = new TreeNode(3);
        ro.right.right = new TreeNode(4);
        List<Integer> res = s.boundaryOfBinaryTree(ro);
        assertEquals("[1, 3, 4, 2]", Arrays.toString(res.toArray()));
    }
}
