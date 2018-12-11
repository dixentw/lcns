package idv.lc.link;

import java.util.*;

public class LC92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        int cnt = 1;
        while (first != null && cnt <= m-1) {
            first = first.next;
            cnt++;
        }
        ListNode last = first.next;
        ListNode curr = last;
        ListNode prev = null;
        ListNode next = null;
        cnt = n-m+1;
        while (curr != null && cnt > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            cnt--;
        }
        first.next = prev;
        last.next = next;
        return dummy.next;
    }
}
