package idv.lc.link;

import java.util.*;

public class LC61 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        int len = 0;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        int traverse = len - (k % len);
        if (traverse == len) return head;
        curr = head;
        while (traverse > 1) {
            curr = curr.next;
            traverse--;
        }
        ListNode dummy  = new ListNode(0);
        dummy.next = curr.next;
        ListNode tail = curr;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        tail.next = null;
        return dummy.next;
    }
}
