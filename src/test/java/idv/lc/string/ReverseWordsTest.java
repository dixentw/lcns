package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ReverseWordsTest {
    ReverseWords s = new ReverseWords();
    @Test
    public void test1(){
        assertEquals("blue is sky the",
                s.reverseWords("the sky is blue"));
         assertEquals("blue is sky the",
                s.reverseWords("       the sky is blue         "));
          assertEquals("blue is sky the",
                s.reverseWords("the     sky is       blue"));
           assertEquals("",s.reverseWords(""));
           assertEquals("",s.reverseWords(" "));
    }
}
