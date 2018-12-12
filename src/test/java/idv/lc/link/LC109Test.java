package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC109Test {
    LC109 s = new LC109();
    @Test
    public void test1(){
        ListNode l = new ListNode(-10);
        l.next = new ListNode(-3);
        l.next.next = new ListNode(0);
        l.next.next.next = new ListNode(5);
        l.next.next.next.next = new ListNode(9);
        TreeNode root = s.sortedListToBST(l);
        assertEquals(0, root.val);
        assertEquals(-3, root.left.val);
        assertEquals(9, root.right.val);

    }
}
