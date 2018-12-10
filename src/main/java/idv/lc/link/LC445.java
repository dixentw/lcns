package idv.lc.link;

import java.util.*;

public class LC445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> st1 = new Stack<>();
        Stack<ListNode> st2 = new Stack<>();
        while (l1 != null) {
            st1.push(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            st2.push(l2);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode curr = null;
        ListNode prev = null;
        while (!st1.empty() || !st2.empty()) {
            int num1 = 0;
            int num2 = 0;
            if (!st1.empty()) num1 = st1.pop().val;
            if (!st2.empty()) num2 = st2.pop().val;
            int sum = num1+num2+carry;
            carry = sum / 10;
            curr = new ListNode(sum%10);
            curr.next = prev;
            prev = curr;
        }
        if (carry != 0) {
            curr = new ListNode(carry);
            curr.next = prev;
            prev = curr;
        }
        return curr;
    }
}
