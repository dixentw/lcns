package idv.lc.link;

import java.util.*;

public class LC86 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyLess = new ListNode(0);
        ListNode dummyMore = new ListNode(0);
        ListNode currLess = dummyLess;
        ListNode currMore = dummyMore;
        while (head != null) {
            if (head.val < x) {
                currLess.next = head;
                currLess = currLess.next;
            } else {
                currMore.next = head;
                currMore = currMore.next;
            }
            head = head.next;
        }
        currMore.next = null;
        currLess.next = dummyMore.next;
        return dummyLess.next;
    }
}
