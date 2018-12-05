package idv.lc.link;

import java.util.*;

public class LC147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = head;
        ListNode curr = head;
        while (curr != null) {
            if (prev.val > curr.val) {
                ListNode t = dummy;
                while (t.next != null && t.next.val < curr.val) t = t.next;
                prev.next = curr.next;
                curr.next = t.next;
                t.next = curr;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
    
    public ListNode __insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode sorted = dummy;
        while (head != null) {
            if (head.val < sorted.val && sorted != dummy) {
                ListNode curr = dummy;
                while (curr.next != null && curr.next.val < head.val) curr = curr.next;
                ListNode next = head.next;
                head.next = curr.next;
                curr.next = head;
                head = next;
            } else {
                sorted = head;
                head = head.next;
            }
        }
        return dummy.next;
    }
}
