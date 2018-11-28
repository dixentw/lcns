package idv.lc.link;

import java.util.*;

public class LC148 {
    public ListNode sortList(ListNode head) {
        if (head == null  || head.next == null ) return head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!= null && fast.next.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode p2 = slow.next;
        slow.next = null;
        ListNode h1 = sortList(head);
        ListNode h2 = sortList(p2);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (h1 != null || h2 != null) {
            if (h1 == null) {
                curr.next = h2;
                break;
            }
            if (h2 == null) {
                curr.next = h1;
                break;
            }
            if (h1.val > h2.val) {
                curr.next = h2;
                h2 = h2.next;
            } else {
                curr.next = h1;
                h1 = h1.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
