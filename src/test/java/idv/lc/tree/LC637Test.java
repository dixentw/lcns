package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC637Test {
    LC637 s = new LC637();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(3);
        ro.left = new TreeNode(9);
        ro.right = new TreeNode(20);
        ro.right.left = new TreeNode(15);
        ro.right.right = new TreeNode(7);
        List<Double> res = s.averageOfLevels(ro);
        assertEquals("[3.0, 14.5, 11.0]", Arrays.toString(res.toArray()));

    }
}
