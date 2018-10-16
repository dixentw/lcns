package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC513Test {
    LC513 s = new LC513();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(2);
        ro.left = new TreeNode(1);
        ro.right = new TreeNode(3);
        assertEquals(1, s.findBottomLeftValue(ro));
    }
}
