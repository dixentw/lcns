package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC147Test {
    LC147 s = new LC147();
    @Test
    public void test1(){
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode res = s.insertionSortList(head);
        assertEquals(1, res.val);
        assertEquals(2, res.next.val);
        assertEquals(3, res.next.next.val);
        assertEquals(4, res.next.next.next.val);
    }
}
