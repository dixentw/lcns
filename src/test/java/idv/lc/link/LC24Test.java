package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC24Test {
    LC24 s = new LC24();
    @Test
    public void test1(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        ListNode res = s.swapPairs(l);
        assertEquals(2, res.val);
        assertEquals(1, res.next.val);
        assertEquals(4, res.next.next.val);
        assertEquals(3, res.next.next.next.val);
    }
    @Test
    public void test2(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        ListNode res = s.swapPairs(l);
        assertEquals(2, res.val);
        assertEquals(1, res.next.val);
        assertEquals(3, res.next.next.val);
    }
}
