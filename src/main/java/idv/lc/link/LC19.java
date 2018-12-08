package idv.lc.link;

import java.util.*;

public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (n>=0) {
            fast = fast.next;
            n--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode next = slow.next;
        slow.next = next.next;
        return dummy.next;
    }
}
