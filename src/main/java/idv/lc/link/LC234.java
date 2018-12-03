package idv.lc.link;

import java.util.*;

public class LC234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode curr = slow.next;
        ListNode prev = null;
        slow.next = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while (head != null || prev != null) {
            if (head == null) return false;
            if (prev == null) break;
            if (head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;

    }
}
