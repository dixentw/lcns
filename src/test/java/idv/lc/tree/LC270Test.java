package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC270Test {
    LC270 s = new LC270();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(4);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(5);
        ro.left.left = new TreeNode(1);
        ro.left.right = new TreeNode(3);
        assertEquals(4, s.closestValue(ro, 3.714286));
    }
}
