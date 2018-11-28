package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC206Test {
    LC206 s = new LC206();
    @Test
    public void test1(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        ListNode h = s.reverseList(l);
        assertEquals(3, h.val);
        assertEquals(2, h.next.val);
        assertEquals(1, h.next.next.val);
    }
}
