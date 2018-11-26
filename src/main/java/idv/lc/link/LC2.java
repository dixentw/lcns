package idv.lc.link;

import java.util.*;

public class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1!=null || l2 !=null) {
            int val1 = (l1==null)?0:l1.val;
            int val2 = (l2==null)?0:l2.val;
            int sum = val1+val2+carry;
            ListNode cur = new ListNode(sum%10);
            carry = sum/10;
            head.next = cur;
            head = head.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry!=0) {
            head.next = new ListNode(carry);
        }
        return dummy.next;
    }
    public ListNode __addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = l1;
        while (l1 != null || l2 != null) {
            if (l1== null) {
                l1 = l2;
                l2 = l2.next;
                continue;
            }
            if (l2 == null) {
                l2 = l1;
                l1 = l1.next;
                continue;
            }
            int sum = l1.val + l2.val;
            carry = sum /10;
            l1.val = sum % 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            l1.next = new ListNode(carry);
        }
        return head;
    }
}
