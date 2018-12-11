package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC83Test {
    LC83 s = new LC83();
    @Test
    public void test1(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(1);
        l.next.next = new ListNode(2);
        ListNode res = s.deleteDuplicates(l);
        assertEquals(1, res.val);
        assertEquals(2, res.next.val);
    }
    @Test
    public void test2(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(1);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(3);
        l.next.next.next.next = new ListNode(3);
        ListNode res = s.deleteDuplicates(l);
        assertEquals(1, res.val);
        assertEquals(2, res.next.val);
        assertEquals(3, res.next.next.val);
    }
}
