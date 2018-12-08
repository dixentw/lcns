package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC19Test {
    LC19 s = new LC19();
    @Test
    public void test1(){
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        ListNode res = s.removeNthFromEnd(root, 2);
        assertEquals(1, res.val);
        assertEquals(2, res.next.val);
        assertEquals(3, res.next.next.val);
        assertEquals(5, res.next.next.next.val);
        assertNull(res.next.next.next.next);
    }
    @Test
    public void test2(){
        ListNode root = new ListNode(1);
        ListNode res = s.removeNthFromEnd(root, 1);
        assertNull(res);
    }
}
