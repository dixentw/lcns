package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC86Test {
    LC86 s = new LC86();
    @Test
    public void test1(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(4);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(2);
        l.next.next.next.next = new ListNode(5);
        l.next.next.next.next.next = new ListNode(2);
        ListNode res = s.partition(l, 3);
        assertEquals(1, res.val);
        assertEquals(2, res.next.val);
        assertEquals(2, res.next.next.val);
        assertEquals(4, res.next.next.next.val);
        assertEquals(3, res.next.next.next.next.val);
        assertEquals(5, res.next.next.next.next.next.val);
    }
}
