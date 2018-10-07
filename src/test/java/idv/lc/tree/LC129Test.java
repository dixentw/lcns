package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC129Test {
    LC129 s = new LC129();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(1);
        ro.left = new TreeNode(2);
        ro.right = new TreeNode(3);
        assertEquals(25, s.sumNumbers(ro));
    }
}
