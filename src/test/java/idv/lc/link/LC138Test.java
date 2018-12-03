package idv.lc.link;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC138Test {
    LC138 s = new LC138();
    @Test
    public void test1(){
        RandomListNode rl = new RandomListNode(-1);
        rl.next = new RandomListNode(1);
        RandomListNode res = s.copyRandomList(rl);
        assertEquals(-1,res.label);
        assertEquals(1,res.next.label);
    }
    @Test
    public void test2(){
        RandomListNode rl = new RandomListNode(-1);
        rl.random = rl;
        RandomListNode res = s.copyRandomList(rl);
        assertEquals(-1,res.label);
        assertNull(res.next);
    }
}
