package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UncommonWordTest {
    UncommonWord s = new UncommonWord();
    @Test
    public void test1(){
        String[] arr = s.uncommonFromSentences("this apple is sweet", "this apple is sour");
        assertEquals("[sweet, sour]", Arrays.toString(arr));
    }
    @Test
    public void test2(){
        String[] arr = s.uncommonFromSentences("apple apple", "banana");
        assertEquals("[banana]", Arrays.toString(arr));
    }
}
