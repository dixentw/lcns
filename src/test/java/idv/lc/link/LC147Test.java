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
        System.out.printf("%d->%d->%d->%d\n",
                head.val,
                head.next.val,
                head.next.next.val,
                head.next.next.next.val);
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
    }
}
