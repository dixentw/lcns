package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC2Test {
    LC2 s = new LC2();
    @Test
    public void test1(){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode res = s.addTwoNumbers(l1, l2);
        assertEquals(7, res.val);
        assertEquals(0, res.next.val);
        assertEquals(8, res.next.next.val);

    }
}
