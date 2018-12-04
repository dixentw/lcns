package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC234Test {
    LC234 s = new LC234();
    @Test
    public void test1(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        assertFalse(s.isPalindrome(l));
    }
    @Test
    public void test2(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(1);
        assertTrue(s.isPalindrome(l));
    }
    @Test
    public void test3(){
        ListNode l = new ListNode(1);
        l.next = new ListNode(0);
        l.next.next = new ListNode(2);
        assertFalse(s.isPalindrome(l));
    }
}
