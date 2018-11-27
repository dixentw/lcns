package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC21Test {
    LC21 s = new LC21();
    @Test
    public void test1(){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode head = s.mergeTwoLists(l1, l2);
        int[] res = new int[6];
        int i = 0;
        while (head != null){
            res[i++] = head.val;
            head = head.next;
        }
        assertEquals("[1, 1, 2, 3, 4, 4]", Arrays.toString(res));
    }
    @Test
    public void test2(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode head = s.mergeTwoLists(l1, l2);
        int[] res = new int[4];
        int i = 0;
        while (head != null){
            res[i++] = head.val;
            head = head.next;
        }
        assertEquals("[1, 1, 3, 4]", Arrays.toString(res));
    }
}
