package idv.lc.link;

import java.util.*;

public class LC328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode od = new ListNode(0);
        ListNode ed = new ListNode(0);
        ListNode odd = od;
        ListNode even = ed;
        int order  = 1;
        while (head != null) {
            if (order%2 == 1) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
            head = head.next;
            order++;
        }
        even.next = null;
        odd.next = ed.next;
        return od.next;
    }
}
