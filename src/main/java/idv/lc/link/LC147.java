package idv.lc.link;

import java.util.*;

public class LC147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode sorted = dummy;
        while (head != null) {
            System.out.println(head.val);
            System.out.println(sorted.val);
            if (head.val < sorted.val && sorted != dummy) {
                ListNode curr = dummy;
                while (curr.next != null && curr.next.val < head.val) curr = curr.next;
                System.out.println(curr.val);
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
