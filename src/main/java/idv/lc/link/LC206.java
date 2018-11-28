package idv.lc.link;

import java.util.*;

public class LC206 {
    public ListNode reverseList(ListNode head) {
        return helper(head, null);
    }

    public ListNode helper(ListNode head, ListNode prev) {
        if (head == null) return prev;
        ListNode next = head.next;
        head.next = prev;
        return helper(next, head);
    }

    public ListNode __reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
