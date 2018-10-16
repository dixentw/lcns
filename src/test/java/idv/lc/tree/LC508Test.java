package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC508Test {
    LC508 s = new LC508();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(5);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(-3);
        int[] res = s.findFrequentTreeSum(ro);
        assertEquals("[2, -3, 4]", Arrays.toString(res));
    }
}
