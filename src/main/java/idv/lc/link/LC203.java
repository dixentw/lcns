package idv.lc.link;

import java.util.*;

public class LC203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null) {
            ListNode n = curr.next;
            if (n.val == val) {
                curr.next = n.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
