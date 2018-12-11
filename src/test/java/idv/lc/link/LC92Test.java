package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC92Test {
    LC92 s = new LC92();
    @Test
    public void test1(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        ListNode res = s.reverseBetween(l, 2, 4);
        assertEquals(1, res.val);
        assertEquals(4, res.next.val);
        assertEquals(3, res.next.next.val);
        assertEquals(2, res.next.next.next.val);
        assertEquals(5, res.next.next.next.next.val);
    }
    @Test
    public void test2(){
        ListNode l = new ListNode(5);
        ListNode res = s.reverseBetween(l, 1, 1);
        assertEquals(5, res.val);
    }
    @Test
    public void test3(){
        ListNode l = new ListNode(3);
        l.next = new ListNode(5);
        ListNode res = s.reverseBetween(l, 1, 2);
        assertEquals(5, res.val);
        assertEquals(3, res.next.val);
    }
}
