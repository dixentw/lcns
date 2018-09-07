package idv.lc.string;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LetterCombiTest {
    LetterCombi s = new LetterCombi();
    @Test
    public void test1(){
        List<String> res = s.letterCombinations("23");
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", Arrays.toString(res.toArray()));
    }
}
