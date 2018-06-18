package idv.lc.array;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class NumMatchSubSeqTest {
    NumMatchSubSeq s = new NumMatchSubSeq();
    @Test
    public void test1(){
        assertEquals(3, s.numMatchingSubseq("abcde", new String[]{"a", "bb", "acd", "ace"}));
    }
}
