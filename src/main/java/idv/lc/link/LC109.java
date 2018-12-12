package idv.lc.link;

import java.util.*;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
public class LC109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev == null) {
            return new TreeNode(slow.val);
        }
        TreeNode root = new TreeNode(prev.next.val);
        prev.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
