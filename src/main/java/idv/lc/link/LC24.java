package idv.lc.link;

import java.util.*;

public class LC24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null && curr.next.next != null) {
            ListNode later = curr.next.next;
            ListNode former = curr.next;
            curr.next = later;
            former.next = later.next;
            later.next = former;
            curr = former;
        }
        return dummy.next;
    }
}
