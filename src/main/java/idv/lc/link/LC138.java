package idv.lc.link;

import java.util.*;

class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
}

public class LC138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return head;
        RandomListNode curr = head;
        while (curr != null) {
            RandomListNode copy = new RandomListNode(curr.label);
            RandomListNode n = curr.next;
            curr.next = copy;
            copy.next = n;
            curr = n;
        }
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next; // curr.random's copy
            }
            curr = curr.next.next;
        }
        curr = head;
        RandomListNode res = head.next;
        RandomListNode itr = res;
        while (curr != null) {
            RandomListNode n = curr.next.next;
            RandomListNode copyNext = (n==null) ? null : n.next;
            curr.next = n;
            itr.next = copyNext;

            // move forward.
            itr = itr.next;
            curr = curr.next;
        }
        return res;
    }
    public RandomListNode __copyRandomList(RandomListNode head) {
        if (head == null) return head;
        RandomListNode curr = head;
        Map<RandomListNode, RandomListNode> cloned = new HashMap<>();
        while (curr != null) {
            cloned.put(curr, new RandomListNode(curr.label));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            cloned.get(curr).next = cloned.get(curr.next);
            cloned.get(curr).random = cloned.get(curr.random);
            curr = curr.next;
        }
        return cloned.get(head);
    }
}
