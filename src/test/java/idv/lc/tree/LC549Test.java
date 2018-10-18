package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC549Test {
    LC549 s = new LC549();
    @Test
    public void test1(){
        TreeNode ro = new TreeNode(2);
        ro.left = new TreeNode(1);
        ro.right = new TreeNode(3);
        assertEquals(3, s.longestConsecutive(ro));
    }
}
