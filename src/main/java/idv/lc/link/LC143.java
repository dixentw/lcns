package idv.lc.link;

import java.util.*;

public class LC143 {
    public void reorderList(ListNode head) {
        if (head == null) return;
        //find half :
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode curr = slow.next;
        slow.next =  null;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr = head;
        while (curr != null && prev != null) {
            ListNode n = curr.next;
            ListNode pn = prev.next;
            curr.next = prev;
            prev.next = n;
            curr = n;
            prev = pn;
        }
    }
    public void _reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            st.push(curr);
            curr = curr.next;
        }
        int cnt = (st.size()-1)/2;//from back
        curr = head;
        ListNode n = null;
        while (cnt > 0) {
            ListNode rear = st.pop();
            n = curr.next;
            curr.next = rear;
            rear.next = n;
            curr = n;
            cnt--;
        }
    }
}
