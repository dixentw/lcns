package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC203Test {
    LC203 s = new LC203();
    @Test
    public void test1(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(6);
        l.next.next.next = new ListNode(3);
        l.next.next.next.next = new ListNode(4);
        l.next.next.next.next.next = new ListNode(6);
        ListNode res = s.removeElements(l, 6);
        assertEquals(1, res.val);
        assertEquals(2, res.next.val);
        assertEquals(3, res.next.next.val);
        assertEquals(4, res.next.next.next.val);
        assertNull(res.next.next.next.next);
    }
    @Test
    public void test2(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(1);
        ListNode res = s.removeElements(l, 1);
        assertNull(res);
    }
}
