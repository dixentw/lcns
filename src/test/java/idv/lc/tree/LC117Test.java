package idv.lc.tree;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC117Test {
    LC117 s = new LC117();
    @Test
    public void test1(){
        TreeLinkNode ro = new TreeLinkNode(1);
        ro.left = new TreeLinkNode(2);
        ro.right = new TreeLinkNode(3);
        ro.left.left = new TreeLinkNode(4);
        ro.left.right = new TreeLinkNode(5);
        ro.right.right = new TreeLinkNode(7);
        s.connect(ro);
        TreeLinkNode leftMost = ro.left.left;
        assertEquals(4,leftMost.val);
        assertEquals(5,leftMost.next.val);
        assertEquals(7,leftMost.next.next.val);
        assertEquals(null,leftMost.next.next.next);
    }
}
