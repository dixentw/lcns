package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LC763Test {
    LC763 s = new LC763();
    @Test
    public void test1(){
        List<Integer> l = s.partitionLabels("ababcbacadefegdehijhklij");
        assertEquals(3, l.size());
        assertEquals(9, (int)l.get(0));
        assertEquals(7, (int)l.get(1));
        assertEquals(8, (int)l.get(2));
    }
}
